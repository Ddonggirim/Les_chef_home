//package com.example.LesChef.entity;
//
//
//import com.example.LesChef.dto.RecipeForm;
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//
//public class Recipe {
//    @Id
//    private Long recipeId;
//    @Column(nullable = false)
//    private String recipeName;
//    @Column(nullable = false)
//    private Long view;
//    @Column(nullable = false)
//    private String writeDate;
//    @Column(nullable = false)
//    private Long runTime;
//    @Column(nullable = false)
//    private String portion;
//
//    public RecipeForm toForm(){
//        return new RecipeForm(this.recipeId, this.recipeName, this.view, this.writeDate, this.runTime, this.portion);
//    }
//}
