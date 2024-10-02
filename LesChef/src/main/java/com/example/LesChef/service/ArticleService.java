package com.example.LesChef.service;

import com.example.LesChef.dto.ArticleForm;
import com.example.LesChef.entity.Article;
import com.example.LesChef.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<ArticleForm> getArticleList(){
        List<Article> Articles = articleRepository.findAll();
        return Articles.stream()
                .map(Article::toForm)
                .collect(Collectors.toList());
    }

    public ArticleForm getArticle(Long id){
        Article article = articleRepository.findById(id).orElse(null);
        return article.toForm();
    }

    public List<ArticleForm> getMyArticleList(String userNickName){
        List<Article> myArticles = articleRepository.findMyArticle(userNickName);
        return myArticles.stream()
                .map(Article::toForm)
                .collect(Collectors.toList());
    }

    public void createArticle(ArticleForm form){
        Article article = form.toEntity();
        articleRepository.save(article);
    }

    public void deleteArticle(Long id){
        Article articleId = articleRepository.findById(id).orElse(null);
        articleRepository.delete(articleId);
    }
}
