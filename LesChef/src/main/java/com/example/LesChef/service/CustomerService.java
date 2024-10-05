package com.example.LesChef.service;


import com.example.LesChef.dto.AddCustomerRequest;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
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
    @Transactional
    public void edit(AddCustomerRequest dto, String id){

        Customer customer = customerRepository.findById(id).orElse(null);

        if(customer != null){
            customer.setPassword(bCryptPasswordEncoder.encode(dto.getPassword()));
            log.info("정보수정됨");
            customer.setName(dto.getName());
            customer.setNickname(dto.getNickname());
            customer.setTel(dto.getTel());
            customerRepository.save(customer);

        }
    }

    public String findMyId(String name, String tel){

        String myId = customerRepository.findId(name, tel);
        if(myId != null){
            return myId;
        }
        return null;

    }
}
