package com.example.LesChef.repository;

import com.example.LesChef.entity.RecipeArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeArticleRepository extends JpaRepository<RecipeArticle, Long> {
    @Query(value = "select * from Recipe_Article where user_nick_Name = :user_nick_Name", nativeQuery = true)
    List<RecipeArticle> findMyArticle(String user_nick_Name);
}
