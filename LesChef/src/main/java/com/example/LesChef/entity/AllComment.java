package com.example.LesChef.entity;

import com.example.LesChef.dto.CommentForm;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AllComment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "all_comment_id_seq")
    @SequenceGenerator(name = "all_comment_id_seq", sequenceName = "all_comment_id_seq", initialValue = 1, allocationSize = 1)
    private Long commentId;
    private String commentContent;
    @ManyToOne
    @JoinColumn(name = "nickname", referencedColumnName = "nickname")
    private Customer commenter;
    private LocalDateTime writeDate;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    private Long rating;

    @Builder
    public AllComment(String commentContent, Customer commenter, LocalDateTime writeDate,
                      Recipe recipe, Article article, Long rating){
        this.commentContent = commentContent;
        this.commenter = commenter;
        this.writeDate = writeDate;
        this.recipe = recipe;
        this.article = article;
        this.rating = rating;

    }
    public CommentForm toForm(){
        return new CommentForm(this.commentId, this.commentContent,
                this.commenter, this.writeDate, this.recipe, this.article,
                this.rating);
    }
}



