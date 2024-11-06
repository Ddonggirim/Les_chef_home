package com.example.LesChef.controller;

import com.example.LesChef.dto.*;
import com.example.LesChef.entity.*;
import com.example.LesChef.service.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class RecipeListController {

    private final RecipecategoryService recipecategoryService;

    private final RecipeService recipeService;

    private final AllCommentService allCommentService;

    private final WishListService wishListService;

    // 나라별 음식
    @GetMapping("/List/Korean") //한식레시피 모음
    public String korean(Model model){

        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("한식");
        List<RecipeForm> recipes = recipeService.getRecipeList("한식");


        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);

        return "recipe/List";
    }

    @GetMapping("/List/Japanese") //일식 레시피 모음
    public String japanese(Model model){

        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("일식");
        List<RecipeForm> recipes = recipeService.getRecipeList("일식");

        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);

        return "recipe/List";

    }
    @GetMapping("/List/Chinese") // 중식 레시피 모음
    public String chinese(Model model){

        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("중식");
        List<RecipeForm> recipes = recipeService.getRecipeList("중식");

        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);

        return "recipe/List";

    }
    @GetMapping("/List/Western") // 양식 레시피 모음
    public String western(Model model){

        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("양식");
        List<RecipeForm> recipes = recipeService.getRecipeList("양식");

        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);

        return "recipe/List";

    }
    @GetMapping("/List/Share") // 공유 레시피 모음
    public String Share(Model model){

        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("공유");
        List<RecipeForm> recipes = recipeService.getRecipeList("공유");

        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);

        return "recipe/List";
    }

    // 음식 종류에 맞는 음식 가져오기
    @GetMapping("/List/{englishName}/{sort}")
    public String getRecipeOfKind(@PathVariable("englishName") String englishName, @PathVariable("sort") String sort, Model model){

        String typeOfSort = recipecategoryService.getTypeOfSort(englishName, sort, model);
        String categoryName = recipecategoryService.getCategoryName(englishName);

        recipeService.getSortRecipe(categoryName, typeOfSort, model);

        return "recipe/List";
    }

    // 레시피 세부정보
    @GetMapping("/inform/{id}")
    public String getRecipeInform(@PathVariable("id") Long id, HttpServletRequest request,
                                  HttpServletResponse response, Model model, HttpSession session){

        Customer currentUser = (Customer)session.getAttribute("customer");
        String userId = currentUser.getId();

        // 쿠키기반 조회수
        recipeService.increaseViewNum(id, request, response);

        //레시피 세부정보
        RecipeForm recipeInform = recipeService.getRecipeInform(id);
        List<RecipeStepForm> steps = recipeService.getRecipeStep(id);
        List<RecipeIngredientForm> ingredients = recipeService.getIngredient(id);
        // 댓글 정보
        List<CommentForm> comments = allCommentService.getRecipeComment(id);
        // 별점 정보
        List<Double> doubleList = allCommentService.getCommentAvg(id);
        // 찜한 레시피인지 확인
        wishListService.getWish(id, userId, model);

        model.addAttribute("inform", recipeInform);
        model.addAttribute("steps", steps);
        model.addAttribute("ingredients", ingredients);
        model.addAttribute("comments", comments);
        model.addAttribute("ratingList", doubleList);

        // id가 500이상인 것은 공유레시피이므로 500이상인지 확인
        if(id >= 500) {
            return "recipe/informShare";
        }
        return "recipe/inform";
    }

    // 레시피 댓글 작성
    @PostMapping("/inform/{id}/comment")
    public String addComment(@PathVariable("id") Long id, @ModelAttribute CommentForm commentForm, HttpSession session, RedirectAttributes reat){

        Customer currentUser = (Customer)session.getAttribute("customer");
        // 이미 댓글을 쓴 회원인지 확인하기위해 댓글을 가져오기
        List<CommentForm> comments = allCommentService.getRecipeComment(id);
        // 현재 댓글을 작성하는 레시피의 정보를 댓글에 저장하기위해 레시피 가져오기
        Recipe recipe = recipeService.getRecipe(id);

        // 레시피 댓글 작성서비스
        boolean commentCreate = allCommentService.insertRecipeComment(commentForm, currentUser, comments, recipe);
        if(commentCreate){
            recipeService.updateRatingAvg(id);

            reat.addFlashAttribute("commentCreate", "댓글이 성공적으로 작성되었습니다");
        } else{
            reat.addFlashAttribute("commentCreateError", "이미 댓글을 작성하셨습니다");
        }
        // 작성한 댓글의 별점을 총별점에 더하여 별점 업데이트

        return "redirect:/inform/{id}";
    }

}
