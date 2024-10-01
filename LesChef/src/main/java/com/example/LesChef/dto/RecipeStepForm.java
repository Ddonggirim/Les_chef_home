package com.example.LesChef.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RecipeStepForm {
    private Long recipeStepId;
    private Long recipeId;
    private Long stepNum;
    private String stepWay;
    private String stepImg;
}
