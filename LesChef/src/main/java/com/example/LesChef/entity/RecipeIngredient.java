package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeIngredientForm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RecipeIngredient {
    @Id
    private Long recipe_Ingredient_Id;
    @Column(nullable = false)
    private Long recipe_Id;
    @Column(nullable = false)
    private String ingredient_Name;
    private String ingredient_Volume;
    @Column(nullable = false)
    private String ingredient_Unit;

    public RecipeIngredientForm toForm(){
        return new RecipeIngredientForm(this.recipe_Ingredient_Id, this.recipe_Id,
                this.ingredient_Name, this.ingredient_Volume, this.ingredient_Unit);
    }
}
