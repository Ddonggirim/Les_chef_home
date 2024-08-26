package com.example.LesChef.controller;

import com.example.LesChef.dto.AddCustomerRequest;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CustomerApiController {

    @Autowired
    private final CustomerRepository customerRepository;
    private final CustomerService customerService;

    @PostMapping("/signup")
    public String signup(AddCustomerRequest request){
        if(customerRepository.findById(request.getId()).orElse(null) != null){
            log.info("회원가입 실패");
            return "redirect:/main";
        }
        customerService.save(request);
        log.info("회원가입 성공");
        return "redirect:/main";
    }

    @GetMapping("/logout")
        public String logout(HttpServletRequest request, HttpServletResponse response, HttpSession session){
         new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
         session.invalidate();
         log.info("세션 삭제성공");
         return "redirect:/loginpage";
    }
}
