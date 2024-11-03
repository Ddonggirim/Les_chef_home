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

    private final ArticleService articleService;

    private final AllCommentService allCommentService;

    // 게시글 페이지 이동
    @GetMapping("/NoticeBoard")
    public String NoticeBoard(Model model){

        List<ArticleForm> articles = articleService.getArticleList();
        model.addAttribute("articles", articles);

        return "community/NoticeBoardMain";
    }

    // 게시글 페이지 최신순, 조회순 정렬
    @GetMapping("/NoticeBoard/{sort}")
    public String sortArticle(@PathVariable("sort") String sort, Model model){
            // sort의 종류에 따라 정렬
            articleService.getSortArticleList(sort, model);

        return "community/NoticeBoardMain";
    }
    //게시글 상세정보, 조회수
    @GetMapping("/article/{id}")
    public String getArticle(@PathVariable("id") Long id, HttpServletRequest request, HttpServletResponse response, Model model){

        // 쿠키기반 조회수
        articleService.increaseViewNum(id, request, response);
        //게시글 정보
        Article article = articleService.getArticle(id);
        ArticleForm articleForm = article.toForm();
        // 게시글 댓글
        List<CommentForm> comments = allCommentService.getArticleComment(id);

        model.addAttribute("article", articleForm);
        model.addAttribute("comments", comments);

        return "community/Gesigeul";
    }

    // 게시글 작성
    @PostMapping("/article/regist")
    public String uploadImage(ArticleForm form, @RequestParam("file")MultipartFile file, HttpSession session){

        Customer currentUser = (Customer)session.getAttribute("customer");

        articleService.createArticle(form, file, currentUser);

        return "community/NoticeBoardMain";
    }

    // 게시글 댓글 작성
    @PostMapping("article/{id}/comment")
    public String addComment(@PathVariable("id") Long id, @ModelAttribute CommentForm commentForm, HttpSession session){

        Customer currentUser = (Customer)session.getAttribute("customer");
        // 댓글을 작성하는 게시글 가져오기
        Article article = articleService.getArticle(id);
        allCommentService.insertArticleComment(commentForm, currentUser, article);

        return "redirect:/article/{id}";
    }

    // 게시글 수정 페이지 이동
    @PostMapping("/article/editPage/{id}")
    public String articleEditPage(@PathVariable("id") Long id, Model model){

        articleService.articleEditPage(id, model);

        return "community/GesiEdit";
    }

    //게시글 수정
    @PostMapping("/article/edit/{id}")
    public String articleEdit(@PathVariable("id") Long id, ArticleForm articleForm, @RequestParam("file")MultipartFile file){

        articleService.editArticle(id, articleForm, file);

        return "redirect:/myarticle";
    }

}
