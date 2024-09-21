package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeForm;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipe_Id;
    @Column(nullable = false)
    private String recipe_Name;
    @Column(nullable = false)
    private Long view_Num;
    @Column(nullable = false)
    private Date write_Date; /*Date*/
    @Column(nullable = false)
    private String run_Time;
    @Column(nullable = false)
    private String portion;
    @Column(nullable = false)
    private String cook_Level;
//    @Column(nullable = false)
    private String user_Id;
    @Column(nullable = false)
    private String recipe_Img;
    @Column(nullable = false)
    private String majorCategory;
    private String sub_Category;

    @Builder
    public Recipe(String recipe_Name, Long view_Num, Date write_Date,
                  String run_Time, String portion, String cook_Level,
                  String user_Id, String recipe_Img, String majorCategory,
                  String sub_Category){
        this.recipe_Name = recipe_Name;
        this.view_Num = view_Num;
        this.write_Date = write_Date;
        this.run_Time = run_Time;
        this.portion = portion;
        this.cook_Level = cook_Level;
        this.user_Id = user_Id;
        this.recipe_Img = recipe_Img;
        this.majorCategory = majorCategory;
        this.sub_Category = sub_Category;
    }


    public RecipeForm toForm(){
        return new RecipeForm(this.recipe_Id, this.recipe_Name,
                this.view_Num, this.write_Date, this.run_Time,
                this.portion, this.cook_Level, this.user_Id, this.recipe_Img,
                this.majorCategory, this.sub_Category);
    }
}
