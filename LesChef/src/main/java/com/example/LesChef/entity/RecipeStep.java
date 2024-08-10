//package com.example.LesChef.entity;
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//public class RecipeStep {
//    @Id
//    private Long recipeStepId;
//    @Column(nullable = false)
//    private Long recipeId;
//    @Column(nullable = false)
//    private Long stepNum;
//    @Column(nullable = false)
//    private String stepWay;
//    @Column(nullable = false)
//    private String stepTip;
//    @Column(nullable = false)
//    private String stepImg;
//
//    public RecipeStepForm toForm(){
//        return new RecipeStepForm(this.recipeStepId, this.recipeId, this.stepNum, this.stepWay, this.stepTip, this.stepImg);
//    }
//
//}
