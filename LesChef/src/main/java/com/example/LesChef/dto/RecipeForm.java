package com.example.LesChef.dto;

import com.example.LesChef.entity.Recipe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class RecipeForm {
    private Long recipe_Id;
    private String recipe_Name;
    private Long view_Num;
    private Date write_Date; /*Date*/
    private String run_Time;
    private Long portion;/*몇인분*/
    private String cook_Level;
    private String user_Id;
    private String recipe_Img;
    private String majorCategory;
    private String sub_Category;

    public Recipe toEntity(){
        Recipe recipe = new Recipe();
        recipe.setRecipe_Name(this.recipe_Name);
        recipe.setView_Num(0L);
        recipe.setWrite_Date(Date.valueOf(LocalDate.now()));
        recipe.setRun_Time(this.run_Time);
        recipe.setPortion(this.portion);
        recipe.setCook_Level(this.cook_Level);
        recipe.setUser_Id("a");
        recipe.setRecipe_Img("../image1/ListIcon/recipePic/1seaweedSoupMain.jpg");
        recipe.setMajorCategory("공유");
        recipe.setSub_Category(null);

        return recipe;
    }
}

