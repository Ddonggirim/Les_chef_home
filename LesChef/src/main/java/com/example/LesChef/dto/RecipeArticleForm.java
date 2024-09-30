package com.example.LesChef.dto;

import com.example.LesChef.entity.RecipeArticle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

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
    private Date write_Date;
    private Long view_Num;

    public RecipeArticle toEntity(){
        return RecipeArticle.builder()
                .user_nickName(this.user_nickName)
                .article_Title(this.article_Title)
                .article_Sub_Title(this.article_Sub_Title)
                .article_Img(this.article_Img)
                .content(this.content)
                .write_Date(Date.valueOf(LocalDate.now()))
                .view_Num(0L)
                .build();
    }
}
