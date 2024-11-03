package com.example.LesChef.controller;

import com.example.LesChef.dto.AddCustomerRequest;
import com.example.LesChef.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CustomerApiController {

    private final CustomerService customerService;

    //회원가입 요청, 유효성 검사 결과
    @PostMapping("/signup")
    public String signup(@Valid AddCustomerRequest request, BindingResult result){
        if(result.hasErrors()){
            log.info("형식이 맞지않음");
        }else{
            log.info("형식이 맞음");
            customerService.save(request);
        }
        return "redirect:/main";
    }

}
