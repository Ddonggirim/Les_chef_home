package com.example.LesChef.repository;

import com.example.LesChef.dto.RecipeIngredientForm;
import com.example.LesChef.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long> {
    @Query(value = "select * from Recipe_Ingredient where recipe_id = :recipeId ORDER BY Recipe_Ingredient_Id", nativeQuery = true)
    List<RecipeIngredient> findByRecipeId(@Param("recipeId") Long recipeId);

    @Modifying
    @Query(value = "delete from Recipe_Ingredient where recipe_id = :recipeId", nativeQuery = true)
    void deleteIngredient(@Param("recipeId") Long recipeId);

    @Query(value = "select COUNT(*) from Recipe_Ingredient where recipe_id =:recipeId", nativeQuery = true)
    Long findIngredientCount(@Param("recipeId") Long recipeId);

    @Modifying
    @Query(value = "update Recipe_Ingredient set Ingredient_Name = :ingredientName, Ingredient_Volume = :ingredientVolume, recipe_id = :recipeId where Recipe_Ingredient_Id = :ingredientId", nativeQuery = true)
    void updateIngredient(@Param("ingredientId") Long ingredientId, @Param("ingredientName") String ingredientName, @Param("ingredientVolume") String ingredientVolume, @Param("recipeId") Long recipeId);
}

