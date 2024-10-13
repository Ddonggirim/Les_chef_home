package com.example.LesChef.repository;

import com.example.LesChef.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByMajorCategory(String majorCategory);
    @Query(value = "select * from Recipe where user_Id = :userId", nativeQuery = true)
    List<Recipe> findMyRecipe(@Param("userId") String userId);

    @Query(value = "select * from Recipe where major_Category = :koreanName and sub_Category = :sort", nativeQuery = true)
    List<Recipe> findSortRecipe(@Param("koreanName") String koreanName, @Param("sort") String sort);

    @Modifying
    @Query(value = "update Recipe set view_num = view_num + 1 where recipe_id = :recipeId", nativeQuery = true)
    void updateRecipeView(@Param("recipeId") Long recipeId);


}
