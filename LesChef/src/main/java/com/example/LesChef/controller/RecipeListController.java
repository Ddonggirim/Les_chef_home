package com.example.LesChef.controller;

import com.example.LesChef.dto.*;
import com.example.LesChef.entity.*;
import com.example.LesChef.repository.AllCommentRepository;
import com.example.LesChef.repository.RecipeIngredientRepository;
import com.example.LesChef.repository.RecipeRepository;
import com.example.LesChef.repository.RecipeStepRepository;
import com.example.LesChef.service.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class RecipeListController {

    private final RecipecategoryService recipecategoryService;

    private final RecipeService recipeService;



    private final RecipeIngredientRepository recipeIngredientRepository;

    private final RecipeStepRepository recipeStepRepository;

    private final RecipeRepository recipeRepository;

    private final AllCommentService allCommentService;

    private final AllCommentRepository allCommentRepository;

    private final WishListService wishListService;

    @GetMapping("/List/Korean") //한식레시피 모음
    public String korean(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("한식");
        List<RecipeForm> recipes = recipeService.getRecipeList("한식");


        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);
        return "recipe/List";
    }

    @GetMapping("/List/{englishName}/{sort}")
    public String getRecipeOfKind(@PathVariable("englishName") String englishName, @PathVariable("sort") String sort, Model model){
        String typeOfSort = recipecategoryService.getTypeOfSort(englishName, sort, model);
        String categoryName = recipecategoryService.getCategoryName(englishName);
        recipeService.getSortRecipe(categoryName, typeOfSort, model);
        return "recipe/List";
    }

    @GetMapping("/List/Japanese") //일식 레시피 모음
    public String japanese(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("일식");
        List<RecipeForm> recipes = recipeService.getRecipeList("일식");
//        recipecategoryService.toModel(recipecategoryForm, model);
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
//        recipecategoryService.toModel(recipecategoryForm, model);
        return "recipe/List";

    }
    @GetMapping("/List/Western") // 양식 레시피 모음
    public String western(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("양식");
        List<RecipeForm> recipes = recipeService.getRecipeList("양식");
        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);
//        recipecategoryService.toModel(recipecategoryForm, model);
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



    @GetMapping("/inform/{id}") // 레시피 세부정보
    public String getRecipeInform(@PathVariable("id") Long id, HttpServletRequest request,
                                  HttpServletResponse response, Model model, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String userId = currentUser.getId();
        // 쿠키기반 조회수
        recipeService.increaseViewNum(id, request, response);
        RecipeForm recipeInform = recipeService.getRecipeInform(id);
        List<RecipeStepForm> steps = recipeService.getRecipeStep(id);
        List<RecipeIngredientForm> ingredients = recipeService.getIngredient(id);
        List<CommentForm> comments = allCommentService.getRecipeComment(id);
        List<Double> doubleList = allCommentService.getCommentAvg(id);
        log.info("getWish전");
        wishListService.getWish(id, userId, model);
        log.info("getWish후");
        log.info("comments는 " + comments.isEmpty());
        //model service로 옮기기
        model.addAttribute("inform", recipeInform);
        model.addAttribute("steps", steps);
        model.addAttribute("ingredients", ingredients);
        model.addAttribute("comments", comments);
        model.addAttribute("ratingList", doubleList);

        if(id >= 500) {
            return "recipe/informShare";
        }
        return "recipe/inform";
    }

    @PostMapping("/inform/{id}/comment")
    public String addComment(@PathVariable("id") Long id, @ModelAttribute CommentForm commentForm,
                             HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String userNickName = currentUser.getNickname();
        List<CommentForm> comments = allCommentService.getRecipeComment(id);
        for(CommentForm comment : comments){
            if(comment.getCommenter().getNickname().equals(userNickName)) {
                //리다이렉트 메시지로 하나의 댓글만 입력할 수 있다 출력
                return "redirect:/inform/{id}";
            }
        }
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        commentForm.setRecipe(recipe);
        commentForm.setArticle(null);
        commentForm.setCommenter(currentUser);
        AllComment saveComment = commentForm.toEntity();
        allCommentRepository.save(saveComment);
        recipeService.updateRatingAvg(id);

        return "redirect:/inform/{id}";
    }

//    @PostMapping("/inform/{id}/wishList")
//    public ResponseEntity<WishList> wishListOn(@PathVariable("id") Long recipeId, HttpSession session){
//        Customer currentUser = (Customer)session.getAttribute("customer");
//        String userId = currentUser.getId();
//        Recipe recipe = recipeService.getRecipe(recipeId);
//        String recipeName = recipe.getRecipeName();
//        WishList wish = wishListService.getWish(recipeId, userId);
////        if(wish != null){
////
////        }else{
//            WishList wishList = new WishList();
//            wishList.setCustomer(currentUser);
//            wishList.setRecipe(recipe);
//            WishList savedWishlist = wishListService.wishSave(wishList);
//            return ResponseEntity.status(HttpStatus.CREATED).body(savedWishlist);
////        }
//
//    }

}
