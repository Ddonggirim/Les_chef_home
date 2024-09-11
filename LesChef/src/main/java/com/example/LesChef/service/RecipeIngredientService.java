package com.example.LesChef.service;

import com.example.LesChef.dto.RecipeIngredientForm;
import com.example.LesChef.entity.RecipeIngredient;
import com.example.LesChef.repository.RecipeIngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RecipeIngredientService {
    private final RecipeIngredientRepository recipeIngredientRepository;

    public List<RecipeIngredientForm> getIngredient(Long id){
        List<RecipeIngredient> ingredients = recipeIngredientRepository.findByRecipeId(id);
        return ingredients.stream()
                .map(RecipeIngredient::toForm)
                .collect(Collectors.toList());
    }
}
