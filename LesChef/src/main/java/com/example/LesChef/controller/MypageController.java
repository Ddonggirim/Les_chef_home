package com.example.LesChef.controller;

import com.example.LesChef.dto.AddCustomerRequest;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.CustomerService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MypageController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customerRewrite")
    public String customerEdit(AddCustomerRequest dto, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String currentId = currentUser.getId();
        log.info("현재 유저ID:" + currentId);

        customerService.edit(dto, currentId);

        session.invalidate();
        return "redirect:/main";
    }

    @PostMapping("/customerDelete")
    public String customerDelete(HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        customerRepository.delete(currentUser);
        session.invalidate();
        return "redirect:/main";
    }
}
