package com.example.LesChef.controller;

import com.example.LesChef.dto.RecipeArticleForm;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.RecipeArticle;
import com.example.LesChef.repository.RecipeArticleRepository;
import com.example.LesChef.service.RecipeArticleService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class NoticeBoardController {

    private final RecipeArticleRepository recipeArticleRepository;
    private final RecipeArticleService recipeArticleService;

    @GetMapping("/NoticeBoard")
    public String NoticeBoard(Model model){
        List<RecipeArticleForm> articles = recipeArticleService.getArticleList();
        model.addAttribute("articles", articles);
        return "community/NoticeBoardMain";
    }

    @GetMapping("/article/{id}")
    public String getArticle(@PathVariable("id") Long id, Model model){
        RecipeArticleForm form = recipeArticleService.getArticle(id);
        model.addAttribute("article", form);
        return "community/Gesigeul";
    }
    @PostMapping("/article/regist")
    public String uploadImage(@ModelAttribute RecipeArticleForm form, @RequestParam("file")MultipartFile file, HttpSession session, Model model){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String usernickName = currentUser.getNickname();
//        RecipeArticle article = new RecipeArticle();
//        article.setUser_nickName(usernickName);
//        article.setArticle_Title(form.getArticle_Title());
//        article.setArticle_Sub_Title(form.getArticle_Sub_Title());
//        article.setContent(form.getContent());
        form.setUser_nickName(usernickName);
        log.info("여기까지옴");
        try {
            String filePath = "C:/LesChef_note/LesChef/src/main/resources/static/uploads/" + file.getOriginalFilename(); //uploads의 절대경로 (상대경로x)
            log.info(filePath);
            log.info("file비어있지않음");
            File dest = new File(filePath);
            file.transferTo(dest);
            log.info("여기까지옴2");
            form.setArticle_Img("../uploads/" + file.getOriginalFilename());
            recipeArticleService.createArticle(form);
//            recipeArticleRepository.save(form);
        } catch (IOException e) {
        }
        return "redirect:/main";
    }

}
