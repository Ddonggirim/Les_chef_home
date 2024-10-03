package com.example.LesChef.service;

import com.example.LesChef.dto.RecipeForm;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.repository.RecipeRepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;

    private final AllCommentService allCommentService;

    public List<RecipeForm> getRecipeList(String majorCategory){
        List<Recipe> recipes = recipeRepository.findByMajorCategory(majorCategory);
        return recipes.stream()
                .map(Recipe::toForm)
                .collect(Collectors.toList());

    }

    public RecipeForm getRecipeInform(Long id){
        Recipe inform = recipeRepository.findById(id).orElse(null);
        return inform.toForm();
    }

    public Long createRecipe(RecipeForm form){

        Recipe recipe = form.toEntity();
        recipeRepository.save(recipe);
        return recipe.getRecipeId();
    }

    public List<RecipeForm> getMyRecipeList(String userId){
        List<Recipe> myRecipes = recipeRepository.findMyRecipe(userId);
        return myRecipes.stream()
                .map(Recipe::toForm)
                .collect(Collectors.toList());
    }

    public void deleteRecipe(Long id){
        Recipe recipeId = recipeRepository.findById(id).orElse(null);
        recipeRepository.delete(recipeId);
    }

    public void updateRatingAvg(Long recipeId){
        List<Double> ratingAvg = allCommentService.getCommentAvg(recipeId);


        Recipe recipe = recipeRepository.findById(recipeId).orElse(null);
        log.info("평점은: " + ratingAvg.get(0));
        recipe.setRatingAvg(ratingAvg.get(0));
        recipeRepository.save(recipe);
    }
}
