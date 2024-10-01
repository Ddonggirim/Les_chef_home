package com.example.LesChef.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class RecipeIngredientForm {
    private Long recipeIngredientId;
    private Long recipeId;
    private String ingredientName;
    private String ingredientVolume;

}
