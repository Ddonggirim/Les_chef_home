package com.example.LesChef.repository;

import com.example.LesChef.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByMajorCategory(String majorCategory);
    @Query(value = "select * from Recipe where user_Id = :userId", nativeQuery = true)
    List<Recipe> findMyRecipe(String userId);
}
