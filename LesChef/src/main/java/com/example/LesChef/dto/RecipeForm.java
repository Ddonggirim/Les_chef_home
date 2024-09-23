package com.example.LesChef.dto;

import com.example.LesChef.entity.Recipe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecipeForm {
    private Long recipe_Id;
    private String recipe_Name;
    private Long view_Num;
    private Date write_Date; /*Date*/
    private String run_Time;
    private String portion;/*몇인분*/
    private String cook_Level;
    private String user_Id;
    private String recipe_Img;
    private String majorCategory;
    private String sub_Category;

    public Recipe toEntity() {
        return Recipe.builder()
                .recipe_Name(this.recipe_Name)
                .view_Num(0L)
                .write_Date(Date.valueOf(LocalDate.now()))
                .run_Time(this.run_Time)
                .portion(this.portion)
                .cook_Level(this.cook_Level)
                .user_Id(this.user_Id)
                .recipe_Img("../image1/ListIcon/recipePic/1seaweedSoupMain.jpg")
                .majorCategory("공유")
                .sub_Category(null)
                .build();
    }
}

