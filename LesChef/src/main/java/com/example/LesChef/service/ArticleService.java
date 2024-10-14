package com.example.LesChef.service;

import com.example.LesChef.dto.ArticleForm;
import com.example.LesChef.entity.Article;
import com.example.LesChef.repository.ArticleRepository;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<ArticleForm> getArticleList(){
        List<Article> articles = articleRepository.findAll();
        return articles.stream()
                .map(Article::toForm)
                .collect(Collectors.toList());
    }

    public void getSortArticleList(String sort, Model model){
        if("latest".equals(sort)){
            List<Article> articles = articleRepository.findLatestArticles();
            model.addAttribute("articles", articles);
        }else{
            List<Article> articles = articleRepository.findViewsArticles();
            model.addAttribute("articles", articles);
        }

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

    @Transactional
    public void increaseViewNum(Long id, HttpServletRequest request, HttpServletResponse response){
        String cookieName = "articleView_" + id;

        Cookie[] cookies = request.getCookies();
        boolean alreadyViewed = false;

        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(cookieName)){
                    alreadyViewed = true;
                    break;
                }
            }
        }

        if(!alreadyViewed){
            articleRepository.updateArticleView(id);

            Cookie cookie = new Cookie(cookieName, "true");
            cookie.setMaxAge(30);
            response.addCookie(cookie);
        }
    }
}
