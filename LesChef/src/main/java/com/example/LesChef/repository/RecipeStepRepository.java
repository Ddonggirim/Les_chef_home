package com.example.LesChef.repository;

import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.RecipeStep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeStepRepository extends JpaRepository<RecipeStep, Long> {
    @Query(value = "select * from Recipe_Step where recipe_id = :recipeId ORDER BY Step_Num", nativeQuery = true)
    List<RecipeStep> findByRecipeId(@Param("recipeId") Long recipeId);

    @Modifying
    @Query(value = "delete from Recipe_Step where recipe_id = :recipeId", nativeQuery = true)
    void deleteStep(@Param("recipeId") Long recipeId);

    @Query(value = "select COUNT(*) from Recipe_Step where recipe_id =:recipeId", nativeQuery = true)
    Long findStepCount(@Param("recipeId") Long recipeId);

    @Modifying
    @Query(value = "update Recipe_Step set recipe_id = :recipeId, Step_Num = :stepNum, Step_Way = :stepWay, Step_Img = :stepImg where Recipe_Step_Id = :stepId", nativeQuery = true)
    void updateStep(@Param("stepId") Long stepId, @Param("recipeId") Long recipeId, @Param("stepNum") Long stepNum, @Param("stepWay") String stepWay, @Param("stepImg") String stepImg);
}
