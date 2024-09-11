package com.example.LesChef.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RecipeIngredientForm {
    private Long recipe_Ingredient_Id;
    private Long recipe_Id;
    private String ingredient_Name;
    private String ingredient_Volume;
    private String ingredient_Unit;
}
