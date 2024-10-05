package com.example.LesChef.entity;

import com.example.LesChef.dto.ArticleForm;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_id_seq")
    @SequenceGenerator(name = "article_id_seq", sequenceName = "article_id_seq", initialValue = 1, allocationSize = 1)
    private Long articleId;
    private String userNickName;
    private String articleTitle;
    private String articleSubTitle;
    private String articleImg;
    private String content;
    private Date writeDate;
    private Long viewNum;


    @Builder
    public Article(String userNickName, String articleTitle, String articleSubTitle,
                   String articleImg, String content, Date writeDate, Long viewNum){
        this.userNickName = userNickName;
        this.articleTitle = articleTitle;
        this.articleSubTitle = articleSubTitle;
        this.articleImg = articleImg;
        this.content = content;
        this.writeDate = writeDate;
        this.viewNum = viewNum;
    }

    public ArticleForm toForm(){
        return new ArticleForm(this.articleId, this.userNickName, this.articleTitle,
                this.articleSubTitle, this.articleImg, this.content, this.writeDate, this.viewNum);
    }

}
