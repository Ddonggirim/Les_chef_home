package com.example.LesChef.entity;

import com.example.LesChef.dto.ArticleForm;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    @ManyToOne
    @JoinColumn(name = "nickname", referencedColumnName = "nickname")
    private Customer userNickName;
    private String articleTitle;
    private String articleSubTitle;
    private String articleImg;
    private String content;
    private LocalDateTime writeDate;
    private Long viewNum;


    @Builder
    public Article(Customer userNickName, String articleTitle, String articleSubTitle,
                   String articleImg, String content, LocalDateTime writeDate, Long viewNum){
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

