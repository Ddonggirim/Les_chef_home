package com.example.LesChef.repository;

import com.example.LesChef.entity.AllComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AllCommentRepository extends JpaRepository<AllComment, Long> {

    @Query(value = "select * from All_Comment where recipe_id = :recipeId", nativeQuery = true)
    List<AllComment> findRecipeComment(@Param("recipeId") Long recipeId);

    @Query(value = "select * from All_Comment where article_id = :articleId", nativeQuery = true)
    List<AllComment> findArticleComment(@Param("articleId") Long articleId);

    @Query(value = "select * from All_Comment where commenter = :commenter and article_id is null", nativeQuery = true)
    List<AllComment> findMyRecipeComment(@Param("commenter") String commenter);
    @Query(value = "select * from All_Comment where commenter = :commenter and recipe_id is null", nativeQuery = true)
    List<AllComment> findMyArticleComment(@Param("commenter") String commenter);

    @Modifying
    @Query(value = "delete from All_Comment where recipe_id = :recipeId", nativeQuery = true)
    void deleteRecipeComment(@Param("recipeId") Long recipeId);
    @Modifying
    @Query(value = "delete from All_Comment where article_id = :articleId", nativeQuery = true)
    void deleteArticleComment(@Param("articleId") Long articleId);
}
