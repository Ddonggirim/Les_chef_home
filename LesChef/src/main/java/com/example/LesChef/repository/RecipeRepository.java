package com.example.LesChef.repository;

import com.example.LesChef.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByMajorCategory(String major_Category);
    @Query(value = "select * from Recipe where user_Id = :user_Id", nativeQuery = true)
    List<Recipe> findMyRecipe(String user_Id);
}
