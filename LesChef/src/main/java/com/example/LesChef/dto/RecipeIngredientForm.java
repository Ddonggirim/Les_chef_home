package com.example.LesChef.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class RecipeIngredientForm {
    private Long recipe_Ingredient_Id;
    private Long recipe_Id;
    private String ingredient_Name;
    private String ingredient_Volume;

}
