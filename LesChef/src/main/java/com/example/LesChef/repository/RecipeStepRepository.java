package com.example.LesChef.repository;

import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.RecipeStep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeStepRepository extends JpaRepository<RecipeStep, Long> {
    @Query(value = "select * from Recipe_Step where Recipe_Id = :recipe_Id", nativeQuery = true)
    List<RecipeStep> findByRecipe_Id(Long recipe_Id);
}
