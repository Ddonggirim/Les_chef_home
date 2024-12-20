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
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> wishSave(@RequestBody WishListForm wishListForm, HttpSession session){

        Customer currentUser = (Customer)session.getAttribute("customer");

        Long recipeId = wishListForm.getRecipe().getRecipeId();
        Recipe recipe = recipeService.getRecipe(recipeId);

        wishListForm.setCustomer(currentUser);
        wishListForm.setRecipe(recipe);
        WishList wishList = wishListForm.toEntity();

        wishListService.wishSave(wishList);

        return ResponseEntity.ok("{\"message\":\"찜목록 저장\"}");
    }

    @PostMapping("/wishDelete")
    public ResponseEntity<String> wishDelete(@RequestBody WishListForm wishListForm, HttpSession session){

        Customer currentUser = (Customer)session.getAttribute("customer");

        String userId = currentUser.getId();
        Long recipeId = wishListForm.getRecipe().getRecipeId();

        wishListService.wishDelete(recipeId, userId);

        return ResponseEntity.ok("{\"message\":\"찜목록 삭제\"}");
    }

}
