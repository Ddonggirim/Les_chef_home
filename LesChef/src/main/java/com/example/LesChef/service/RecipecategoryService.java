package com.example.LesChef.service;

import com.example.LesChef.dto.RecipecategoryForm;
import com.example.LesChef.entity.Recipecategory;
import com.example.LesChef.repository.RecipecategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
public class RecipecategoryService {
    private final RecipecategoryRepository recipecategoryRepository;

    public RecipecategoryForm findCategory(String koreanName){
        Recipecategory recipeCategory = recipecategoryRepository.findById(koreanName).orElse(null);
        return recipeCategory != null ? recipeCategory.toForm() : null;
    }

    public void toModel(RecipecategoryForm recipecategoryForm, Model model){
        if(recipecategoryForm != null){
            model.addAttribute("koreanName", recipecategoryForm.getKorean_Name());
            model.addAttribute("englishName", recipecategoryForm.getEnglish_Name());
            model.addAttribute("headImg", recipecategoryForm.getHead_Img());
            model.addAttribute("sortOne", recipecategoryForm.getSort_One());
            model.addAttribute("sortTwo", recipecategoryForm.getSort_Two());
            model.addAttribute("sortThree", recipecategoryForm.getSort_Three());
        }
    }
}
