package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeForm;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private Long portion;
    @Column(nullable = false)
    private String cook_Level;
//    @Column(nullable = false)
    private String user_Id;
    @Column(nullable = false)
    private String recipe_Img;
    @Column(nullable = false)
    private String majorCategory;
    private String sub_Category;

    public RecipeForm toForm(){
        return new RecipeForm(this.recipe_Id, this.recipe_Name,
                this.view_Num, this.write_Date, this.run_Time,
                this.portion, this.cook_Level, this.user_Id, this.recipe_Img,
                this.majorCategory, this.sub_Category);
    }
}
