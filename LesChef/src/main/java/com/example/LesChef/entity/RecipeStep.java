package com.example.LesChef.entity;

import com.example.LesChef.dto.RecipeStepForm;
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
public class RecipeStep {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_step_id_seq")
    @SequenceGenerator(name = "recipe_step_id_seq", sequenceName = "recipe_step_id_seq", initialValue = 10, allocationSize = 1)
    @Column(name = "recipeStepId")
    private Long recipeStepId;
    @Column(name = "recipe_Id", nullable = false)
    private Long recipeId;
    @Column(name = "step_Num", nullable = false)
    private Long stepNum;
    @Column(name = "stepWay", nullable = false)
    private String stepWay;
    @Column(name = "stepImg", nullable = false)
    private String stepImg;

    public RecipeStepForm toForm(){
        return new RecipeStepForm(this.recipeStepId, this.recipeId,
                this.stepNum, this.stepWay, this.stepImg);
    }
}
