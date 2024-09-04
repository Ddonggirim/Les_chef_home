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
    private String korean_Name;
    @Column(name= "ENGLISH_NAME", nullable = false)
    private String english_Name;
    @Column(name= "HEAD_IMG", nullable = false)
    private String head_Img;
    @Column(name= "SORT_ONE", nullable = false)
    private String sort_One;
    @Column(name= "SORT_TWO", nullable = false)
    private String sort_Two;
    @Column(name= "SORT_THREE", nullable = false)
    private String sort_Three;

    public RecipecategoryForm toForm(){
        return new RecipecategoryForm(this.korean_Name, this.english_Name, this.head_Img, this.sort_One, this.sort_Two, this.sort_Three);
    }
}
