package com.example.LesChef.dto;

import com.example.LesChef.entity.Recipecategory;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RecipecategoryForm {
    private String koreanName;
    private String englishName;
    private String headImg;
    private String sortOne;
    private String sortTwo;
    private String sortThree;

    public Recipecategory toEntity(){
        return new Recipecategory(koreanName, englishName, headImg, sortOne, sortTwo, sortThree);
    }
}
