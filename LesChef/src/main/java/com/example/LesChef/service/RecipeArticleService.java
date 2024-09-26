package com.example.LesChef.service;

import com.example.LesChef.dto.RecipeArticleForm;
import com.example.LesChef.entity.RecipeArticle;
import com.example.LesChef.repository.RecipeArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RecipeArticleService {
    private final RecipeArticleRepository recipeArticleRepository;

    public List<RecipeArticleForm> getArticleList(){
        List<RecipeArticle> Articles = recipeArticleRepository.findAll();
        return Articles.stream()
                .map(RecipeArticle::toForm)
                .collect(Collectors.toList());
    }

    public RecipeArticleForm getArticle(Long id){
        RecipeArticle recipeArticle = recipeArticleRepository.findById(id).orElse(null);
        return recipeArticle.toForm();
    }
}
