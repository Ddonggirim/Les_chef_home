package com.example.LesChef.service;

import com.example.LesChef.dto.RecipeCommentForm;
import com.example.LesChef.entity.RecipeComment;
import com.example.LesChef.repository.RecipeCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RecipeCommentService {

    private final RecipeCommentRepository commentRepository;

    public List<RecipeCommentForm> getCommentList(Long recipeId){
        List<RecipeComment> comments = commentRepository.findCommentList(recipeId);
        return comments.stream()
                .map(RecipeComment::toForm)
                .collect(Collectors.toList());
    }
}
