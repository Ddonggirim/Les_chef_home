package com.example.LesChef.repository;

import com.example.LesChef.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Query(value = "select * from Article where user_nick_Name = :userNickName", nativeQuery = true)
    List<Article> findMyArticle(@Param("userNickName") String userNickName);
}
