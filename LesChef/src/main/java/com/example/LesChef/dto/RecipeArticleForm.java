package com.example.LesChef.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RecipeArticleForm {
    private Long article_Id;
    private String user_nickName;
    private String article_Title;
    private String article_Sub_Title;
    private String article_Img;
    private String content;

}
