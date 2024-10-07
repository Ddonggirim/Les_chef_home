package com.example.LesChef.controller;

import com.example.LesChef.entity.Customer;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class WishListController {

//    @PostMapping("/wishListOn")
//    public String wishListOn(HttpSession session){
//        Customer currentUser = (Customer)session.getAttribute("customer");
//        String customerId = currentUser.getId();
//    }

}
