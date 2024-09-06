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
//        if(recipecategoryForm != null){
//            log.info("Form이 들어있음: {}", recipecategoryForm.getKorean_Name());
//            log.info(recipecategoryForm.getEnglish_Name());
//            log.info(recipecategoryForm.getHead_Img());
//            recipecategoryService.toModel(recipecategoryForm, model);
//            return "recipe/List";
//        }else{
//            log.info("Form이 비어있음");
//            return "recipe/List";
//        }
        recipecategoryService.toModel(recipecategoryForm, model);
        return "recipe/List";
    }
    @GetMapping("/List/Japanese")
    public String japanese(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("일식");
        recipecategoryService.toModel(recipecategoryForm, model);
        return "recipe/List";

    }
    @GetMapping("/List/Chinese")
    public String chinese(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("중식");
        recipecategoryService.toModel(recipecategoryForm, model);
        return "recipe/List";

    }
    @GetMapping("/List/Western")
    public String western(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("양식");
        recipecategoryService.toModel(recipecategoryForm, model);
        return "recipe/List";

    }
}
