package com.example.LesChef.controller;

import com.example.LesChef.dto.*;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.RecipeIngredient;
import com.example.LesChef.entity.RecipeStep;
import com.example.LesChef.repository.RecipeIngredientRepository;
import com.example.LesChef.repository.RecipeRepository;
import com.example.LesChef.service.RecipeIngredientService;
import com.example.LesChef.service.RecipeService;
import com.example.LesChef.service.RecipeStepService;
import com.example.LesChef.service.RecipecategoryService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class RecipeListController {
    private final RecipecategoryService recipecategoryService;
    private final RecipeService recipeService;
    private final RecipeStepService recipeStepService;
    private final RecipeIngredientService recipeIngredientService;
    private final RecipeIngredientRepository recipeIngredientRepository;

    @GetMapping("/List/Korean") //한식레시피 모음
    public String korean(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("한식");
        List<RecipeForm> recipes = recipeService.getRecipeList("한식");
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
        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);
//        recipecategoryService.toModel(recipecategoryForm, model);
        return "recipe/List";
    }
    @GetMapping("/List/Japanese") //일식 레시피 모음
    public String japanese(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("일식");
        List<RecipeForm> recipes = recipeService.getRecipeList("일식");
//        recipecategoryService.toModel(recipecategoryForm, model);
        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);
        return "recipe/List";

    }
    @GetMapping("/List/Chinese") // 중식 레시피 모음
    public String chinese(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("중식");
        List<RecipeForm> recipes = recipeService.getRecipeList("중식");
        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);
//        recipecategoryService.toModel(recipecategoryForm, model);
        return "recipe/List";

    }
    @GetMapping("/List/Western") // 양식 레시피 모음
    public String western(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("양식");
        List<RecipeForm> recipes = recipeService.getRecipeList("양식");
        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);
//        recipecategoryService.toModel(recipecategoryForm, model);
        return "recipe/List";

    }
    @GetMapping("/List/Share") // 공유 레시피 모음
    public String Share(Model model){
        RecipecategoryForm recipecategoryForm = recipecategoryService.findCategory("공유");
        List<RecipeForm> recipes = recipeService.getRecipeList("공유");
        model.addAttribute("category", recipecategoryForm);
        model.addAttribute("recipes", recipes);
        return "recipe/List";
    }

    @GetMapping("/inform/{id}") // 레시피 세부정보
    public String getRecipeInform(@PathVariable("id") Long id, Model model){
        if(id >= 500){
            RecipeForm recipeInform = recipeService.getRecipeInform(id);
            List<RecipeStepForm> steps = recipeStepService.getRecipeStep(id);
            List<RecipeIngredientForm> ingredients = recipeIngredientService.getIngredient(id);
            model.addAttribute("inform", recipeInform);
            model.addAttribute("steps", steps);
            model.addAttribute("ingredients", ingredients);
            return "recipe/informShare";
        }
        RecipeForm recipeInform = recipeService.getRecipeInform(id);
        List<RecipeStepForm> steps = recipeStepService.getRecipeStep(id);
        List<RecipeIngredientForm> ingredients = recipeIngredientService.getIngredient(id);
        model.addAttribute("inform", recipeInform);
        model.addAttribute("steps", steps);
        model.addAttribute("ingredients", ingredients);
        return "recipe/inform";
    }

    @PostMapping("/List/create")
    public String createList(@ModelAttribute RecipeForm recipeForm, @ModelAttribute RecipeRegistForm recipeRegistForm, HttpSession session){
        log.info("List/create호출");
        Customer currentUser = (Customer)session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        List<String> ingredients = recipeRegistForm.getIngredients();   //재료이름들
        List<String> quantities = recipeRegistForm.getQuantities();     //재료수량들

        log.info("레시피등록요청");

//        MultipartFile file = recipeForm.getRecipe_Img();
//        String originalFilename = file.getOriginalFilename();
//        String uploadDir = "src/main/resources/static/uploads/";
//        File destinationFile = new File(uploadDir + originalFilename);
//        file.transferTo(destinationFile);
//        log.info("파일 저장 완료: " + destinationFile.getAbsolutePath());
//        recipeForm.setRecipe_Img_Path("../uploads/");
        Long recipeId = recipeService.createRecipe(recipeForm);

        log.info("재료이름의 수:" + ingredients.size());
        log.info("재료수량:" + quantities.size());

            // 파일을 지정된 경로에 저장
            for(int i = 0; i < ingredients.size(); i++){
                RecipeIngredient recipeIngredient = new RecipeIngredient();
                log.info("재료 이름:"+ingredients.get(i));
                recipeIngredient.setRecipe_Id(recipeId);
                recipeIngredient.setIngredient_Name(ingredients.get(i));
                recipeIngredient.setIngredient_Volume(quantities.get(i));
                recipeIngredientRepository.save(recipeIngredient);
            }
        return "redirect:/main";


    }

}
