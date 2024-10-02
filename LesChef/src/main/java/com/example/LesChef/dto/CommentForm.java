package com.example.LesChef.dto;

import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.Article;
import com.example.LesChef.entity.AllComment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentForm {
    private Long commentId;
    private String commentContent;
    private String commenter;
    private LocalDateTime writeDate;
    private Recipe recipe;
    private Article article;
    private Long rating;


    public AllComment toEntity(){
        return AllComment.builder()
                .commentContent(this.commentContent)
                .commenter(this.commenter)
                .writeDate(LocalDateTime.now())
                .recipe(this.recipe)
                .article(this.article)
                .rating(this.rating != null ? this.rating : 0)
                .build();
    }
}
