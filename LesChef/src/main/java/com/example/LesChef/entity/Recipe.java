package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeForm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Recipe {
    @Id
    private Long recipe_Id;
    @Column(nullable = false)
    private String recipe_Name;
    @Column(nullable = false)
    private Long view_Num;
    @Column(nullable = false)
    private String write_Date; /*Date*/
    @Column(nullable = false)
    private String run_Time;
    @Column(nullable = false)
    private Long portion;
    @Column(nullable = false)
    private String cook_Level;
//    @Column(nullable = false)
    private String user_Id;
    @Column(nullable = false)
    private String recipe_Img;
    @Column(nullable = false)
    private String majorCategory;
    @Column(nullable = false)
    private String sub_Category;

    public RecipeForm toForm(){
        return new RecipeForm(this.recipe_Id, this.recipe_Name,
                this.view_Num, this.write_Date, this.run_Time,
                this.portion, this.cook_Level, this.user_Id, this.recipe_Img,
                this.majorCategory, this.sub_Category);
    }
}
