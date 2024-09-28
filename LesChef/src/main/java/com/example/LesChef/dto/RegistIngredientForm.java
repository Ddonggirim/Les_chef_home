package com.example.LesChef.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class RegistIngredientForm {
    private List<String> ingredients;
    private List<String> quantities;


}
