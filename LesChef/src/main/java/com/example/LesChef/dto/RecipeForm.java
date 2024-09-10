package com.example.LesChef.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@AllArgsConstructor
@Getter
public class RecipeForm {
    private Long recipe_Id;
    private String recipe_Name;
    private Long view_Num;
    private String write_Date; /*Date*/
    private String run_Time;
    private Long portion;/*몇인분*/
    private String cook_Level;
    private String user_Id;
    private String recipe_Img;
    private String majorCategory;
    private String sub_Category;
}
