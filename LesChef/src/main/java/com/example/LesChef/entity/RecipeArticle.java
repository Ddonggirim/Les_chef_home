package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeArticleForm;
import com.example.LesChef.dto.RecipeForm;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecipeArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_id_seq")
    @SequenceGenerator(name = "article_id_seq", sequenceName = "article_id_seq", initialValue = 1, allocationSize = 1)
    private Long article_Id;
    private String user_nickName;
    private String article_Title;
    private String article_Sub_Title;
    private String article_Img;
    private String content;
    private Date write_Date;
    private Long view_Num;


    @Builder
    public RecipeArticle(String user_nickName, String article_Title, String article_Sub_Title,
                         String article_Img, String content, Date write_Date, Long view_Num){
        this.user_nickName = user_nickName;
        this.article_Title = article_Title;
        this.article_Sub_Title = article_Sub_Title;
        this.article_Img = article_Img;
        this.content = content;
        this.write_Date = write_Date;
        this.view_Num = view_Num;
    }

    public RecipeArticleForm toForm(){
        return new RecipeArticleForm(this.article_Id, this.user_nickName, this.article_Title,
                this.article_Sub_Title, this.article_Img, this.content, this.write_Date, this.view_Num);
    }

}

