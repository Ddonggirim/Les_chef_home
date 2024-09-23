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
    private Long recipe_Ingredient_Id;
    @Column(nullable = false)
    private Long recipe_Id;
    @Column(nullable = false)
    private String ingredient_Name;
    private String ingredient_Volume;


    public RecipeIngredientForm toForm(){
        return new RecipeIngredientForm(this.recipe_Ingredient_Id, this.recipe_Id,
                this.ingredient_Name, this.ingredient_Volume);
    }
}





