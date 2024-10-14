package com.example.LesChef.repository;

import com.example.LesChef.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query(value = "select * from Article ORDER BY Write_Date DESC, Article_Title ASC", nativeQuery = true)
    List<Article> findLatestArticles();
    @Query(value = "select * from Article ORDER BY View_Num DESC, Article_Title ASC", nativeQuery = true)
    List<Article> findViewsArticles();

    @Query(value = "select * from Article where user_nick_Name = :userNickName", nativeQuery = true)
    List<Article> findMyArticle(@Param("userNickName") String userNickName);

    @Modifying
    @Query(value = "update Article set view_num = view_num + 1 where article_id = :articleId", nativeQuery = true)
    void updateArticleView(@Param("articleId") Long articleId);
}
