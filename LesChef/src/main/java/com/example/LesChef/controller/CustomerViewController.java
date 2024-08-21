package com.example.LesChef.controller;


import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CustomerViewController {

    private final CustomerRepository customerRepository;
    private final CustomerService customerService;

    @GetMapping("/loginpage")
    public String loginpage() {
        return "mainpage";
    }

    @GetMapping("/signup")
    public String signup() {
        return "mainpage";
    }
}
