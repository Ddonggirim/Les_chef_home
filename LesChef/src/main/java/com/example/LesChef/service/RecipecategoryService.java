package com.example.LesChef.service;

import com.example.LesChef.dto.RecipecategoryForm;
import com.example.LesChef.entity.Recipecategory;
import com.example.LesChef.repository.RecipecategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;


@Slf4j
@Service
@RequiredArgsConstructor
public class RecipecategoryService {
    private final RecipecategoryRepository recipecategoryRepository;

    public RecipecategoryForm findCategory(String koreanName){
        log.info(koreanName);
        Recipecategory recipecategory = recipecategoryRepository.findById(koreanName).orElse(null);
        if(recipecategory !=null){
            log.info("레포지토리 ById찾음");
            return recipecategory.toForm();
        }
        log.info("레포지토리 ById못찾음");
        return null;
    }

//    public void toModel(RecipecategoryForm recipecategoryForm, Model model){
//        if(recipecategoryForm != null){
//            model.addAttribute("koreanName", recipecategoryForm.getKorean_Name());
//            model.addAttribute("englishName", recipecategoryForm.getEnglish_Name());
//            model.addAttribute("headImg", recipecategoryForm.getHead_Img());
//            model.addAttribute("sortOne", recipecategoryForm.getSort_One());
//            model.addAttribute("sortTwo", recipecategoryForm.getSort_Two());
//            model.addAttribute("sortThree", recipecategoryForm.getSort_Three());
//        }
//    }
    //이거사용하면 타임리프에서 recipe.korean_Name하지않고 설정한 koreanName으로 타임리프 변수 사용가능
}
