//package com.example.LesChef.entity;
//
//import com.example.LesChef.dto.RecipeCategoryForm;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//public class RecipeCategory {
//    @Id
//    private String koreanName;
//    @Column(nullable = false)
//    private String englishName;
//    @Column(nullable = false)
//    private String headImg;
//    @Column(nullable = false)
//    private String sortOne;
//    @Column(nullable = false)
//    private String sortTwo;
//    @Column(nullable = false)
//    private String sortThree;
//
//    public RecipeCategoryForm toForm(){
//        return new RecipeCategoryForm(this.koreanName, this.englishName, this.headImg, this.sortOne, this.sortTwo, this.sortThree);
//    }
//}
