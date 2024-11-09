package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipecategoryForm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "recipe_category")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Recipecategory {
    @Id
    @Column(name = "KOREAN_NAME")
    private String koreanName;
    @Column(name= "ENGLISH_NAME")
    private String englishName;
    @Column(name= "HEAD_IMG")
    private String headImg;
    @Column(name= "SORT_ONE")
    private String sortOne;
    @Column(name= "SORT_TWO")
    private String sortTwo;
    @Column(name= "SORT_THREE")
    private String sortThree;

    public RecipecategoryForm toForm(){
        return new RecipecategoryForm(this.koreanName, this.englishName, this.headImg, this.sortOne, this.sortTwo, this.sortThree);
    }
}














