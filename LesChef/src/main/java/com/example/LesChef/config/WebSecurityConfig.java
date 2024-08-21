package com.example.LesChef.config;

import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.CustomerDetailService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.security.Provider;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    @Autowired
    private CustomerRepository customerRepository;

    @Bean
    public WebSecurityCustomizer configure() {
        return (web -> web.ignoring()
                .requestMatchers("/image1/**")
                .requestMatchers("/font/**")
                .requestMatchers("/js/**"));
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .headers(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/MainPage", "/List", "/NoticeBoardMain").permitAll().anyRequest().authenticated()
                )
                .formLogin(login -> login
                        .loginProcessingUrl("/login")
                        .usernameParameter("id")
                        .passwordParameter("password")
                        .successHandler((request, response, authentication) -> {
                                User user = (User)authentication.getPrincipal();
                                Customer customer = customerRepository.findById(user.getUsername()).orElse(null);

                                if(customer != null){
                                    HttpSession session = request.getSession(true);
                                    session.setAttribute("customer", customer);
                                    session.setMaxInactiveInterval(1800);
                                        response.sendRedirect("/MainPage");
                                }
                        })
                        .failureHandler((request, response, exception) -> {
                            request.getSession().setAttribute("errorMessage", "아이디 또는 비밀번호가 일치하지 않습니다.");
                            response.sendRedirect("/MainPage");
                        })
                )
                .logout(logout -> logout
                        .deleteCookies("JSESSIONID", "remember-me")
                        .logoutSuccessUrl("/MainPage")
                        .invalidateHttpSession(true)
                ).build();
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, CustomerDetailService customerDetailService)
            throws Exception{
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(customerDetailService);
        authProvider.setPasswordEncoder(bCryptPasswordEncoder);
        return new ProviderManager(authProvider);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
