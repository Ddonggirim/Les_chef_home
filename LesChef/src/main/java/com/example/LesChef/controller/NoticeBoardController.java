package com.example.LesChef.controller;

import com.example.LesChef.dto.ArticleForm;
import com.example.LesChef.dto.CommentForm;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Article;
import com.example.LesChef.entity.AllComment;
import com.example.LesChef.repository.ArticleRepository;
import com.example.LesChef.repository.AllCommentRepository;
import com.example.LesChef.service.ArticleService;
import com.example.LesChef.service.AllCommentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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

    private final ArticleRepository articleRepository;
    private final ArticleService articleService;
    private final AllCommentRepository allCommentRepository;
    private final AllCommentService allCommentService;

    @GetMapping("/NoticeBoard")
    public String NoticeBoard(Model model){
        List<ArticleForm> articles = articleService.getArticleList();
        model.addAttribute("articles", articles);
        return "community/NoticeBoardMain";
    }

    @GetMapping("/NoticeBoard/{sort}")
    public String sortArticle(@PathVariable("sort") String sort, Model model){
            articleService.getSortArticleList(sort, model);
        return "community/NoticeBoardMain";
    }

    @GetMapping("/article/{id}")
    public String getArticle(@PathVariable("id") Long id, HttpServletRequest request, HttpServletResponse response, Model model){
        // 쿠키기반 조회수
        articleService.increaseViewNum(id, request, response);
        ArticleForm form = articleService.getArticle(id);
        List<CommentForm> comments = allCommentService.getArticleComment(id);
        model.addAttribute("article", form);
        model.addAttribute("comments", comments);
        return "community/Gesigeul";
    }
    @PostMapping("/article/regist")
    public String uploadImage(ArticleForm form, @RequestParam("file")MultipartFile file,
                              HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
//        String userNickName = currentUser.getNickname();
//        RecipeArticle article = new RecipeArticle();
//        article.setUser_nickName(usernickName);
//        article.setArticle_Title(form.getArticle_Title());
//        article.setArticle_Sub_Title(form.getArticle_Sub_Title());
//        article.setContent(form.getContent());
            articleService.createArticle(form, file, currentUser);
        return "redirect:/main";
    }

    @PostMapping("article/{id}/comment")
    public String addComment(@PathVariable("id") Long id, @ModelAttribute CommentForm commentForm,
                             HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");

        ArticleForm articleForm = articleService.getArticle(id);
        Article article = articleForm.toEntity();

        allCommentService.insertComment(commentForm, currentUser, article);

        return "redirect:/article/{id}";
    }

    @PostMapping("/article/editPage/{id}")
    public String articleEditPage(@PathVariable("id") Long id, Model model){
        articleService.articleEditPage(id, model);
        return "community/GesiEdit";
    }
    @PostMapping("/article/edit/{id}")
    public String articleEdit(@PathVariable("id") Long id, ArticleForm articleForm, @RequestParam("file")MultipartFile file){
        articleService.editArticle(id, articleForm, file);
        return "redirect:/myarticle";
    }

}
