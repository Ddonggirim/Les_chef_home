//package com.example.LesChef.service;
//
//import com.example.LesChef.dto.RecipeStepForm;
//import com.example.LesChef.entity.RecipeStep;
//import com.example.LesChef.repository.RecipeStepRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class RecipeStepService {
//    private final RecipeStepRepository recipeStepRepository;
//
//    public List<RecipeStepForm> getRecipeStep(Long id){
//        List<RecipeStep> recipeSteps = recipeStepRepository.findByRecipeId(id);
//        return recipeSteps.stream()
//                .map(RecipeStep::toForm)
//                .collect(Collectors.toList());
//    }
//}
////RecipeService랑 통합