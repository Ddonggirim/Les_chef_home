package com.example.LesChef.service;

import com.example.LesChef.dto.RecipeForm;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.repository.RecipeRepository;
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

    public void createRecipe(RecipeForm form){
        Recipe recipe = form.toEntity();
        recipeRepository.save(recipe);
    }
}
