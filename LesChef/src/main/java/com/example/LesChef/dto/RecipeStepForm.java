package com.example.LesChef.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RecipeStepForm {
    private Long recipe_Step_Id;
    private Long recipe_Id;
    private Long step_Num;
    private String step_Way;
    private String step_Img;
}
