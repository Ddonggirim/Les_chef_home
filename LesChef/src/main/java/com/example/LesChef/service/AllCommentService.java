package com.example.LesChef.service;

import com.example.LesChef.dto.CommentForm;
import com.example.LesChef.entity.AllComment;
import com.example.LesChef.repository.AllCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AllCommentService {

    private final AllCommentRepository allCommentRepository;

    public List<CommentForm> getRecipeComment(Long recipeId){
        List<AllComment> comments = allCommentRepository.findRecipeComment(recipeId);
        return comments.stream()
                .map(AllComment::toForm)
                .collect(Collectors.toList());
    }

    public List<CommentForm> getArticleComment(Long articleId){
        List<AllComment> comments = allCommentRepository.findArticleComment(articleId);
        return comments.stream()
                .map(AllComment::toForm)
                .collect(Collectors.toList());
    }

    public List<CommentForm> getMyRecipeComment(String commenter){
        List<AllComment> comments = allCommentRepository.findMyRecipeComment(commenter);
        return comments.stream()
                .map(AllComment::toForm)
                .collect(Collectors.toList());
    }

    public List<CommentForm> getMyArticleComment(String commenter){
        List<AllComment> comments = allCommentRepository.findMyArticleComment(commenter);
        return comments.stream()
                .map(AllComment::toForm)
                .collect(Collectors.toList());
    }

    public void deleteComment(Long id){
        AllComment commentId = allCommentRepository.findById(id).orElse(null);
        allCommentRepository.delete(commentId);
    }
}
