package com.example.LesChef.dto;

import com.example.LesChef.entity.Recipecategory;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RecipecategoryForm {
    private String korean_Name;
    private String english_Name;
    private String head_Img;
    private String sort_One;
    private String sort_Two;
    private String sort_Three;

    public Recipecategory toEntity(){
        return new Recipecategory(korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three);
    }
}
