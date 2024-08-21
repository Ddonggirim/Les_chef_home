package com.example.LesChef.service;


import com.example.LesChef.dto.AddCustomerRequest;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

private final CustomerRepository customerRepository;
private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void save(AddCustomerRequest dto){
        customerRepository.save(Customer.builder()
                .id(dto.getId())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .name(dto.getName())
                .nickname(dto.getNickname())
                .tel(dto.getTel())
                .build());
    }
}
