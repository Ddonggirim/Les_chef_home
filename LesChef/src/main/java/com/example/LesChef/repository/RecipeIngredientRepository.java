package com.example.LesChef.repository;

import com.example.LesChef.dto.RecipeIngredientForm;
import com.example.LesChef.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long> {
    @Query(value = "select * from Recipe_Ingredient where recipe_id = :recipeId", nativeQuery = true)
    List<RecipeIngredient> findByRecipeId(@Param("recipeId") Long recipeId);
}

