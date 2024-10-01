package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeCommentForm;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecipeComment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_comment_id_seq")
    @SequenceGenerator(name = "recipe_comment_id_seq", sequenceName = "recipe_comment_id_seq", initialValue = 1, allocationSize = 1)
    private Long commentId;
    private String commentContent;
    private String commenter;
    private Date writeDate;
    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;
    private Long rating;

    @Builder
    public RecipeComment(String commentContent, String commenter, Date writeDate,
                         Recipe recipe, Long rating){
        this.commentContent = commentContent;
        this.commenter = commenter;
        this.writeDate = writeDate;
        this.recipe = recipe;
        this.rating = rating;

    }
    public RecipeCommentForm toForm(){
        return new RecipeCommentForm(this.commentId, this.commentContent,
                this.commenter, this.writeDate, this.recipe,
                this.rating);
    }
}



