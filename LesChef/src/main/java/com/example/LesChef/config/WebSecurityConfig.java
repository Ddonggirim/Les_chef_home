package com.example.LesChef.config;

import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.CustomerDetailService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
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
@Slf4j
@Configuration  //spring 설정클래스
@EnableWebSecurity  //security활성화
@RequiredArgsConstructor //final 필드 생성자 자동 생성
public class WebSecurityConfig {

    @Autowired
    private CustomerRepository customerRepository;

    @Bean
    public WebSecurityCustomizer configure() { //해당 경로 보안 통과
        return (web -> web.ignoring()
                .requestMatchers("/image1/**")
                .requestMatchers("/uploads/**")
                .requestMatchers("/font/**")
                .requestMatchers("/js/**")
                .requestMatchers("/css/**"))
                ;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .headers(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/signup", "/findId", "/findPwd").permitAll()
                        .requestMatchers("/signup", "/findId", "/findPwd", "/main", "/List/**",
                                "/NoticeBoardMain")
                        .permitAll().anyRequest().authenticated()
                )
                .formLogin(login -> login
                                .loginPage("/main").permitAll()
                                .loginProcessingUrl("/login")
                                .usernameParameter("id")
                                .passwordParameter("password")
                                .successHandler((request, response, authentication) -> {
                                    User user = (User)authentication.getPrincipal();    //로그인 성공 시 인증 정보를 가져옴
                                    Customer customer = customerRepository.findById(user.getUsername()).orElse(null);
                                        HttpSession session = request.getSession(true);
                                        session.setAttribute("customer", customer);
                                        session.setMaxInactiveInterval(1800);
                                        response.sendRedirect("/main");

                                })
                                .failureHandler((request, response, exception) -> {
                                    request.getSession().setAttribute("errorMessage", "아이디 또는 비밀번호가 일치하지 않습니다.");
                                    request.getSession(false).invalidate();
                                    response.sendRedirect("/main");
                                })
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .deleteCookies("JSESSIONID", "remember-me")
                        .invalidateHttpSession(true)
                        .logoutSuccessUrl("/main")


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