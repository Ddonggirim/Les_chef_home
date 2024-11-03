package com.example.LesChef.controller;


import com.example.LesChef.entity.Customer;
import com.example.LesChef.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Slf4j
@Controller
@RequiredArgsConstructor
public class CustomerViewController {

    private final CustomerService customerService;

    @GetMapping("/loginpage")
    public String loginpage(Model model) {
        return "mainpage";
    }



    // 아이디를 찾아서 메시지로 보여주기
    @PostMapping("/findId")
    public String findMyId(@RequestParam("name") String name, @RequestParam("tel") String tel, RedirectAttributes ra) {
        // 받은 정보의 회원이 있는지 확인 후 아이디 가져오기
        String myId = customerService.findMyId(name, tel);

        if (myId != null) {
            ra.addFlashAttribute("name1", name);
            ra.addFlashAttribute("myId", myId);
        } else {
            ra.addFlashAttribute("idMessage", "Id를 찾을 수 없습니다.");
        }

        return "redirect:/main";
    }

    // 사용자의 정보를 확인 후 임시 비밀번호 보여주기
    @PostMapping("/findPwd")
    public String findMyPwd(@RequestParam("PwName") String name, @RequestParam("PwTel") String tel,
                            @RequestParam("PwId") String id, RedirectAttributes ra){
        // 받은 정보의 회원이 있는지 확인
        Customer customer = customerService.findMyPwd(name, tel, id);

        if(customer != null){
            //임시 비밀번호 생성
            String tempPwd = customerService.createTempPwd();
            //임시 비밀번호로 회원의 비밀번호 수정
            customerService.editTempPwd(id, tempPwd);
            ra.addFlashAttribute("name2", name);
            ra.addFlashAttribute("tempPwd", tempPwd);
        } else {
            ra.addFlashAttribute("pwdMessage", "Pwd를 찾을 수 없습니다");
        }
        return "redirect:/main";
    }
}
