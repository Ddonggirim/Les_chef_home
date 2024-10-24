package com.example.LesChef.dto;

import com.example.LesChef.entity.Recipe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class RecipeIngredientForm {
    private Long recipeIngredientId;
    private Recipe recipe;
    private String ingredientName;
    private String ingredientVolume;

}
