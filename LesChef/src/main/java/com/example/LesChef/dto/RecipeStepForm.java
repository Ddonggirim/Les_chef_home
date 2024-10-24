package com.example.LesChef.dto;

import com.example.LesChef.entity.Recipe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RecipeStepForm {
    private Long recipeStepId;
    private Recipe recipe;
    private Long stepNum;
    private String stepWay;
    private String stepImg;
}
