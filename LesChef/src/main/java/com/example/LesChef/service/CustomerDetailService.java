package com.example.LesChef.service;

import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class CustomerDetailService implements UserDetailsService {

    private final CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with id: " + id));
        return new User(customer.getId(), customer.getPassword(), Collections.singleton(new SimpleGrantedAuthority("ROLE_CUSTOMER")));
    }
    //Config에 User user = (User)authentication.getPrincipal(); UserDetailService의 loadUserByUsername메서드는 UserDetails를 반환해야됨
    //Customer엔티티를 반환하면 User로 캐스팅 불가해서 오류

//    @Override
//    public UserDetails loadUserByUsername(String id) {
//        return customerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException((id)));
//    }
}
