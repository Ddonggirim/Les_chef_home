package com.example.LesChef.repository;

import com.example.LesChef.entity.RecipeComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeCommentRepository extends JpaRepository<RecipeComment, Long> {
    @Query(value = "select * from Recipe_Comment where recipe_id = :recipeId", nativeQuery = true)
    List<RecipeComment> findCommentList(Long recipeId);
}
