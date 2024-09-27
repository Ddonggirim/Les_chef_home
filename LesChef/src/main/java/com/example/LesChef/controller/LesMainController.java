package com.example.LesChef.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class LesMainController {
    @GetMapping("/main")
    public String gotoMain() {return "MainPage";}

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
    public String gotoMycomment() {return "mypage/Mycomment";}
    @GetMapping("/Regist")
    public String gotoRegist() {return "mypage/Regist";}
    @GetMapping("/Myrecipe")
    public String gotoMyrecipe() {return "redirect:/myrecipe";}


    @GetMapping("/Login")
    public String gotoLogin() {return "Mainpage";}
}

