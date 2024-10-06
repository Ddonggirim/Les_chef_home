package com.example.LesChef.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
public class LesMainController {
    @GetMapping("/main")
    public String gotoMain(Model model) {
        String name = (String) model.asMap().get("name1");
        String myId = (String) model.asMap().get("myId");
        String message = (String) model.asMap().get("idMessage");

        log.info("메인컨트롤러: " + myId);

        if (myId != null) {
            model.addAttribute("name1", name);
            model.addAttribute("myId", myId);
        } else if (message != null) {
            model.addAttribute("idMessage", message);
        }

        return "MainPage";
    }

    @GetMapping("/List")
    public String gotoList() {return "redirect:/List/Korean";}
    @GetMapping("/inform")
    public String gotoinform() {return "recipe/inform";}



    @GetMapping("/GesiEdit")
    public String gotoGesiEdit() {return "community/GesiEdit";}
    @GetMapping("/Gesigeul")
    public String gotoGesigeul() {return "community/Gesigeul";}
    @GetMapping("/GesiRegist")
    public String gotoGesiRegist() {return "community/GesiRegist";}
    @GetMapping("/NoticeBoardMain")
    public String gotoNoticeBoardMain() {return "redirect:/NoticeBoard";}

    @GetMapping("/Rewrite")
    public String gotoRewrite() {return "mypage/Rewrite";}
    @GetMapping("/WishList")
    public String gotoWishList() {return "mypage/WishList";}
    @GetMapping("/Mycomment")
    public String gotoMycomment() {return "redirect:/myRecipeComment";}
    @GetMapping("/Regist")
    public String gotoRegist() {return "mypage/Regist";}
    @GetMapping("/Myrecipe")
    public String gotoMyrecipe() {return "redirect:/myrecipe";}


    @GetMapping("/Login")
    public String gotoLogin() {return "Mainpage";}
}

