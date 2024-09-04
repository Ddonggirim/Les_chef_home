package com.example.LesChef.controller;

import com.example.LesChef.dto.RecipecategoryForm;
import com.example.LesChef.service.RecipecategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
@RequiredArgsConstructor
public class ListcategoryController {
    private final RecipecategoryService recipecategoryService;

    @GetMapping("/List/Korean")
    public String korean(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("한식");
        if(recipecategoryForm != null){
            log.info("Form이 들어있음: {}", recipecategoryForm.getKorean_Name());
            recipecategoryService.toModel(recipecategoryForm, model);
            return "recipe/List";
        }else{
            log.info("Form이 비어있음");
            return "recipe/List";
        }

    }
}
