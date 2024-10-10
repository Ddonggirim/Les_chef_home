package com.example.LesChef.controller;

import com.example.LesChef.dto.WishListForm;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.WishList;
import com.example.LesChef.service.RecipeService;
import com.example.LesChef.service.WishListService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Slf4j
@Controller
@RequiredArgsConstructor
public class WishListController {

    private final RecipeService recipeService;
    private final WishListService wishListService;

    @PostMapping("/wishSave")
    public String wishSave(@RequestBody WishListForm wishListForm, HttpSession session){
        log.info("wishSave요청");
        Customer currentUser = (Customer)session.getAttribute("customer");
        String customerId = currentUser.getId();
        Long recipeId = wishListForm.getRecipe().getRecipeId();
        Recipe recipe = recipeService.getRecipe(recipeId);
        wishListForm.setCustomer(currentUser);
        wishListForm.setRecipe(recipe);
        WishList wishList = wishListForm.toEntity();
        wishListService.wishSave(wishList);
        log.info("찜목록인데요 저장된 레시피 이름은 " + recipe.getRecipeName());
        log.info("찜목록인데요 레시피아이디는 " + wishListForm.getWishListId());
        log.info("찜목록인데요 유저아이디는 " + wishListForm.getCustomer().getId());
        log.info("찜목록인데요 레시피이름은 " + wishListForm.getRecipe().getRecipeName());
        return "redirect:/inform/" + recipeId;
    }

    @PostMapping("/wishDelete")
    public void wishDelete(@RequestBody WishListForm wishListForm, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String userId = currentUser.getId();
        Long recipeId = wishListForm.getRecipe().getRecipeId();
        wishListService.wishDelete(recipeId, userId);
    }

}
