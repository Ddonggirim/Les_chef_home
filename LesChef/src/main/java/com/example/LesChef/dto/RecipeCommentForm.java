package com.example.LesChef.dto;

import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.RecipeComment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecipeCommentForm {
    private Long commentId;
    private String commentContent;
    private String commenter;
    private Date writeDate;
    private Recipe recipe;
    private Long rating;


    public RecipeComment toEntity(){
        return RecipeComment.builder()
                .commentContent(this.commentContent)
                .commenter(this.commenter)
                .writeDate(Date.valueOf(LocalDate.now()))
                .recipe(this.recipe)
                .rating(0L)
                .build();
    }
}
