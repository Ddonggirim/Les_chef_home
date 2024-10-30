package com.example.LesChef.controller;


import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CustomerViewController {

    private final CustomerService customerService;

    @GetMapping("/loginpage")
    public String loginpage(Model model) {
        return "mainpage";
    }




    @PostMapping("/findId")
    public String findMyId(@RequestParam("name") String name, @RequestParam("tel") String tel, RedirectAttributes ra) {
        String myId = customerService.findMyId(name, tel);
        log.info("나의 아이디는: " + myId);
        if (myId != null) {
            ra.addFlashAttribute("name1", name);
            ra.addFlashAttribute("myId", myId);
        } else {
            ra.addFlashAttribute("idMessage", "Id를 찾을 수 없습니다.");
        }
        log.info("ra의 크기는: "+ra.getFlashAttributes().size());
        return "redirect:/main";
    }

    @PostMapping("/findPwd")
    public String findMyPwd(@RequestParam("PwName") String name, @RequestParam("PwTel") String tel,
                            @RequestParam("PwId") String id, RedirectAttributes ra){
        log.info("findPwd요청들어옴");
        Customer customer = customerService.findMyPwd(name, tel, id);

        if(customer != null){
            String tempPwd = customerService.createTempPwd();
            customerService.editTempPwd(id, tempPwd);
            ra.addFlashAttribute("name2", name);
            ra.addFlashAttribute("tempPwd", tempPwd);
        } else {
            ra.addFlashAttribute("pwdMessage", "Pwd를 찾을 수 없습니다");
        }
        return "redirect:/main";
    }
}
