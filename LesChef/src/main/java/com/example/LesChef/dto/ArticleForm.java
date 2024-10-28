package com.example.LesChef.dto;

import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class ArticleForm {
    private Long articleId;
    private Customer userNickName;
    private String articleTitle;
    private String articleSubTitle;
    private String articleImg;
    private String content;
    private LocalDateTime writeDate;
    private Long viewNum;

    public Article toEntity(){
        return Article.builder()
                .userNickName(this.userNickName)
                .articleTitle(this.articleTitle)
                .articleSubTitle(this.articleSubTitle)
                .articleImg(this.articleImg)
                .content(this.content)
                .writeDate(LocalDateTime.now())
                .viewNum(this.viewNum != null ? this.viewNum : 0)
                .build();
    }
}
