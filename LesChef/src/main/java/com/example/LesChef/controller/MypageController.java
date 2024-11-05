package com.example.LesChef.controller;

import com.example.LesChef.dto.*;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.RecipeIngredient;
import com.example.LesChef.entity.RecipeStep;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.repository.RecipeIngredientRepository;
import com.example.LesChef.repository.RecipeStepRepository;
import com.example.LesChef.service.*;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MypageController {

    private final CustomerService customerService;

    private final RecipeService recipeService;

    private final ArticleService articleService;

    private final AllCommentService allCommentService;

    private final WishListService wishListService;

    // 회원정보 수정
    @PostMapping("/customerRewrite")
    public String customerEdit(AddCustomerRequest dto, @RequestParam("File") MultipartFile file, HttpSession session, RedirectAttributes reat){

        Customer currentUser = (Customer)session.getAttribute("customer");

        customerService.edit(dto, file, currentUser);
        // 수정 후 재로그인을 위해 세션 삭제
        session.invalidate();
        reat.addFlashAttribute("customerEdit", "회원정보가 수정되었습니다. 다시 로그인 해주세요");
        return "redirect:/main";
    }

    // 회원 탈퇴
    @PostMapping("/customerDelete")
    public String customerDelete(HttpSession session, RedirectAttributes reat){

        Customer currentUser = (Customer)session.getAttribute("customer");

        customerService.delete(currentUser);
        // 탈퇴 후 로그인 기록 삭제
        session.invalidate();
        reat.addFlashAttribute("customerDelete", "계정이 성공적으로 삭제되었습니다");
        return "redirect:/main";
    }

    // 찜목록 가져오기
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

        // 현재 사용자의 닉네임으로 레시피 댓글 찾기
        log.info("나의 레시피 댓글");
        List<CommentForm> commentForms = allCommentService.getMyRecipeComment(nickname);
        model.addAttribute("RecipeComment", commentForms);

        return "mypage/Mycomment";

    }
    @GetMapping("/myArticleComment")
    public String articleComment(Model model, HttpSession session){

        Customer currentUser = (Customer) session.getAttribute("customer");
        String nickname = currentUser.getNickname();

        // 현재 사용자의 닉네임으로 게시글 댓글 찾기
        log.info("나의 게시글 댓글");
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
        // 현재 사용자의 닉네임으로 레시피 찾기
        List<RecipeForm> recipeForm = recipeService.getMyRecipeList(nickname);
        model.addAttribute("myRecipes", recipeForm);

        return "mypage/Myrecipe";
    }

    @GetMapping("/myarticle")
    public String myArticleList(Model model, HttpSession session){

        Customer currentUser = (Customer)session.getAttribute("customer");
        String nickname = currentUser.getNickname();

        log.info("나의 게시글 목록");
        // 현재 사용자의 닉네임으로 게시글 찾기
        List<ArticleForm> articleForms = articleService.getMyArticleList(nickname);
        model.addAttribute("myArticles", articleForms);

        return "mypage/Myrecipe";
    }

    //레시피, 게시글 삭제
    @PostMapping("/recipe/delete/{id}")
    public String delRecipe(@PathVariable("id") Long id, RedirectAttributes reat){

        allCommentService.deleteRecipeParent(id);
        wishListService.recipeDeleteWish(id);
        recipeService.deleteRecipe(id);

        reat.addFlashAttribute("recipeDelete", "레시피가 삭제되었습니다");

        return "redirect:/myrecipe";
    }
    @PostMapping("/article/delete/{id}")
    public String delArticle(@PathVariable("id") Long id, RedirectAttributes reat){

        allCommentService.deleteArticleParent(id);
        articleService.deleteArticle(id);
        reat.addFlashAttribute("recipeDelete", "게시글이 삭제되었습니다.");
        return "redirect:/myarticle";
    }

    // 댓글 삭제 및 삭제 댓글 종류 확인
    @PostMapping("/comment/delete/{id}")
    public String delComment(@PathVariable("id") Long id, RedirectAttributes reat){
        // 삭제 댓글 종류에 따른 리다이렉트
        String postType = allCommentService.deleteComment(id);
        reat.addFlashAttribute("commentDelete", "댓글이 삭제되었습니다.");
        if(postType != "recipeType"){
            return "redirect:/myArticleComment";
        }else{
            return "redirect:/myRecipeComment";
        }

    }
    // 찜목록 삭제
    @PostMapping("/wish/delete/{id}")
    public String delWish(@PathVariable("id") Long id, RedirectAttributes reat){

        wishListService.deleteWish(id);

        reat.addFlashAttribute("wishDelete", "찜목록이 삭제되었습니다.");

        return "redirect:/myWishList";
    }
    // 레시피 작성
    @PostMapping("/recipe/create")
    public String createList(@ModelAttribute RecipeForm recipeForm, @ModelAttribute RegistIngredientForm registIngredientForm, @ModelAttribute RegistStepForm registStepForm, @RequestParam("File") MultipartFile file,
                             @RequestParam("stepFiles[]") List<MultipartFile> stepFile, HttpSession session, RedirectAttributes reat){ //mutipartfile로 변환할 수 없는데 input의 name을 form의 이름과 똑같게해서 안됨

        Customer currentUser = (Customer)session.getAttribute("customer");

        log.info("레시피 작성");
        recipeService.createRecipe(recipeForm, registIngredientForm, registStepForm, file, stepFile, currentUser);

        reat.addFlashAttribute("recipeCreate", "레시피가 성공적으로 작성되었습니다");

        return "redirect:/myrecipe";


    }

    //레시피 수정페이지 이동
    @PostMapping("/recipe/editPage/{id}")
    public String recipeEditPage(@PathVariable("id") Long id, Model model){

        recipeService.recipeEditPage(id, model);

        return "mypage/RecipeEdit";
    }

    //레시피 수정
    @PostMapping("/recipe/edit/{id}")
    public String recipeEdit(@PathVariable("id") Long id, RecipeForm recipeForm, RegistIngredientForm registIngredientForm,
                             RegistStepForm registStepForm, @RequestParam("File") MultipartFile file,
                             @RequestParam("stepFiles[]") List<MultipartFile> stepFile,
                             @RequestParam("firstImage[]") List<String> firstImage, RedirectAttributes reat){
        //레시피 아이디, 레시피 수정 데이터, 재료 수정 데이터, 조리순서 수정 데이터, 레시피 이미지, 조리순서 이미지, 조리순서 수정 전 이미지
        recipeService.editRecipe(id, recipeForm, registIngredientForm, registStepForm, file, stepFile, firstImage);

        reat.addFlashAttribute("recipeEdit", "레시피가 수정되었습니다");

        return "redirect:/myrecipe";
    }
}
