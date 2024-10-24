package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeIngredientForm;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_ingredient_id_seq")
    @SequenceGenerator(name = "recipe_ingredient_id_seq", sequenceName = "recipe_ingredient_id_seq", initialValue = 200, allocationSize = 1)
    private Long recipeIngredientId;
    @ManyToOne
    @JoinColumn(name="recipe_id", nullable = false)
    private Recipe recipe;
    @Column(nullable = false)
    private String ingredientName;
    private String ingredientVolume;


    public RecipeIngredientForm toForm(){
        return new RecipeIngredientForm(this.recipeIngredientId, this.recipe,
                this.ingredientName, this.ingredientVolume);
    }
}





