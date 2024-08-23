package com.example.LesChef.controller;

import com.example.LesChef.dto.AddCustomerRequest;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class CustomerApiController {

    @Autowired
    private final CustomerRepository customerRepository;
    private final CustomerService customerService;

    @PostMapping("/signup")
    public String signup(AddCustomerRequest request){
        customerService.save(request);
        return "redirect:/List";
    }

    @GetMapping("/logout")
        public String logout(HttpServletRequest request, HttpServletResponse response, HttpSession session){
         new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
         session.invalidate();
         return "redirect:/loginpage";
    }
}
