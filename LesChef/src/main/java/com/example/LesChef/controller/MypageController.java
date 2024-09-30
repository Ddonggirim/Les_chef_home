package com.example.LesChef.controller;

import com.example.LesChef.dto.AddCustomerRequest;
import com.example.LesChef.dto.RecipeArticleForm;
import com.example.LesChef.dto.RecipeForm;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.service.CustomerService;
import com.example.LesChef.service.RecipeArticleService;
import com.example.LesChef.service.RecipeService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MypageController {

    private final CustomerService customerService;

    private final CustomerRepository customerRepository;

    private final RecipeService recipeService;

    private final RecipeArticleService recipeArticleService;

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

    //
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
        List<RecipeArticleForm> recipeArticleForms = recipeArticleService.getMyArticleList(nickname);
        log.info("article요청2");
        model.addAttribute("myArticles", recipeArticleForms);
        return "mypage/Myrecipe";
    }

    @PostMapping("/recipe/delete/{id}")
    public String delRecipe(@PathVariable("id") Long id){
        recipeService.deleteRecipe(id);
        return "redirect:/myrecipe";
    }
    @PostMapping("/article/delete/{id}")
    public String delArticle(@PathVariable("id") Long id){
        recipeArticleService.deleteArticle(id);
        return "redirect:/myarticle";
    }
}
