package com.example.LesChef.controller;

import com.example.LesChef.dto.RecipecategoryForm;
import com.example.LesChef.service.RecipecategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ListcategoryController {
    private final RecipecategoryService recipecategoryService;

    @GetMapping("/List/Korean")
    public String korean(Model model){
        RecipecategoryForm recipeCategoryForm = recipecategoryService.findCategory("한식");
        recipecategoryService.toModel(recipeCategoryForm, model);

        return "recipe/List";
    }
}
