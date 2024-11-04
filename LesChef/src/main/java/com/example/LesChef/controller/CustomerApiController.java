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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CustomerApiController {

    private final CustomerService customerService;

    //메시지 수정해야됨
    //회원가입 요청, 유효성 검사 결과
    @PostMapping("/signup")
    public String signup(@Valid AddCustomerRequest request, BindingResult result, RedirectAttributes reat){
        if(result.hasErrors()){
            log.info("형식이 맞지않음");
            reat.addFlashAttribute("signupBinding", "형식이 맞지않습니다");
        }else{
            log.info("형식이 맞음");
            //저장이 됐는지 확인
            String saved = customerService.save(request);
            if("save".equals(saved)){
                reat.addFlashAttribute("signupSuccess", "회원가입 성공");
            }else{
                reat.addFlashAttribute("signupFail", "해당 아이디가 이미 존재합니다");
            }
        }
        return "redirect:/main";
    }

}
