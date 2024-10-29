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
import java.util.Random;

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
                .customerImg("/image1/NoticeIcon/duck.jpg")
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
            customer.setCustomerImg(dto.getCustomerImg());
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

    //
    public Customer findMyPwd(String name, String tel, String id){
        Customer customer = customerRepository.findNameTelId(name, tel, id);
        return customer;
    }

    // 임시비밀번호 생성
    public String createTempPwd(){
        String[] tempPwd = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"
        };
        Random random = new Random();
        String pwd = "";
        int i;
        int index = 0;
        for(i = 0; i < 8; i++){
            index = random.nextInt(tempPwd.length);
            pwd += (tempPwd[index]);
        }
        return pwd;
    }

    //생성한 임시 비밀번호 저장
    @Transactional
    public void editTempPwd(String id, String tempPwd){
        Customer customer = customerRepository.findById(id).orElse(null);
        customer.setPassword(bCryptPasswordEncoder.encode(tempPwd));
        customerRepository.save(customer);
    }
}
