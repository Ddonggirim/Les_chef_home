package com.example.LesChef.controller;

import com.example.LesChef.dto.*;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.*;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MypageController {

    private final CustomerService customerService;

    private final CustomerRepository customerRepository;

    private final RecipeService recipeService;

    private final ArticleService articleService;

    private final AllCommentService allCommentService;

    private final WishListService wishListService;

    // 회원정보 수정
    @PostMapping("/customerRewrite")
    public String customerEdit(AddCustomerRequest dto, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String currentId = currentUser.getId();
        log.info("현재 유저ID:" + currentId);

        customerService.edit(dto, currentId);

        session.invalidate();
        return "redirect:/main";
    }

    // 회원 탈퇴
    @PostMapping("/customerDelete")
    public String customerDelete(HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        customerRepository.delete(currentUser);
        session.invalidate();
        return "redirect:/main";
    }

    @GetMapping("myWishList")
    public String wishList(Model model, HttpSession session){
        Customer currentUser = (Customer) session.getAttribute("customer");
        String userId = currentUser.getId();
        wishListService.getMyWishList(userId, model);
        return "mypage/WishList";
    }

    //나의 댓글 가져오기
    @GetMapping("/myRecipeComment")
    public String recipeComment(Model model, HttpSession session) {
        Customer currentUser = (Customer) session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        List<CommentForm> commentForms = allCommentService.getMyRecipeComment(nickname);
        model.addAttribute("RecipeComment", commentForms);
        return "mypage/Mycomment";

    }
    @GetMapping("/myArticleComment")
    public String articleComment(Model model, HttpSession session){
        Customer currentUser = (Customer) session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        List<CommentForm> commentForms = allCommentService.getMyArticleComment(nickname);
        model.addAttribute("ArticleComment", commentForms);
        return "mypage/Mycomment";
    }

    //나의 레시피, 게시글 가져오기
    @GetMapping("/myrecipe")
    public String myRecipeList(Model model, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        log.info("나의 레시피 목록");
        List<RecipeForm> recipeForm = recipeService.getMyRecipeList(nickname);
        model.addAttribute("myRecipes", recipeForm);
        return "mypage/Myrecipe";
    }

    @GetMapping("/myarticle")
    public String myArticleList(Model model, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        log.info("article요청");
        List<ArticleForm> articleForms = articleService.getMyArticleList(nickname);
        log.info("article요청2");
        model.addAttribute("myArticles", articleForms);
        return "mypage/Myrecipe";
    }

    //레시피, 게시글 삭제
    @PostMapping("/recipe/delete/{id}")
    public String delRecipe(@PathVariable("id") Long id){
        allCommentService.deleteRecipeParent(id);
        wishListService.recipeDeleteWish(id);
        recipeService.deleteRecipe(id);
        return "redirect:/myrecipe";
    }
    @PostMapping("/article/delete/{id}")
    public String delArticle(@PathVariable("id") Long id){
        allCommentService.deleteArticleParent(id);
        articleService.deleteArticle(id);
        return "redirect:/myarticle";
    }

    // 댓글 삭제 및 삭제 게시글 종류 확인
    @PostMapping("/comment/delete/{id}")
    public String delComment(@PathVariable("id") Long id){
        String postType = allCommentService.deleteComment(id);
        if(postType != "recipeType"){
            return "redirect:/myArticleComment";
        }else{
            return "redirect:/myRecipeComment";
        }

    }

    @PostMapping("/wish/delete/{id}")
    public String delWish(@PathVariable("id") Long id){
        wishListService.deleteWish(id);
        return "redirect:/myWishList";
    }


}
