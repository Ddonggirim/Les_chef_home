package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeStepForm;
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
public class RecipeStep {
    @Id
    @Column(name = "recipe_Step_Id")
    private Long recipe_Step_Id;
    @Column(name = "recipe_Id", nullable = false)
    private Long recipe_Id;
    @Column(name = "step_Num", nullable = false)
    private Long step_Num;
    @Column(name = "step_Way", nullable = false)
    private String step_Way;
    @Column(name = "step_Img", nullable = false)
    private String step_Img;

    public RecipeStepForm toForm(){
        return new RecipeStepForm(this.recipe_Step_Id, this.recipe_Id,
                this.step_Num, this.step_Way, this.step_Img);
    }
}
