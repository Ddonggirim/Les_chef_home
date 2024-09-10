package com.example.LesChef.repository;

import com.example.LesChef.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByMajorCategory(String major_Category);
}
