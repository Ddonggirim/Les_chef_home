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
    private String korean_Name;
    @Column(nullable = false)
    private String english_Name;
    @Column(nullable = false)
    private String head_Img;
    @Column(nullable = false)
    private String sort_One;
    @Column(nullable = false)
    private String sort_Two;
    @Column(nullable = false)
    private String sort_Three;

    public RecipecategoryForm toForm(){
        return new RecipecategoryForm(this.korean_Name, this.english_Name, this.head_Img, this.sort_One, this.sort_Two, this.sort_Three);
    }
}
