package com.example.LesChef.service;

import com.example.LesChef.dto.*;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.RecipeIngredient;
import com.example.LesChef.entity.RecipeStep;
import com.example.LesChef.repository.RecipeIngredientRepository;
import com.example.LesChef.repository.RecipeRepository;
import com.example.LesChef.repository.RecipeStepRepository;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;

    private final AllCommentService allCommentService;

    private final RecipeStepRepository recipeStepRepository;

    private final RecipeIngredientRepository recipeIngredientRepository;

    public Recipe getRecipe(Long recipeId){
        Recipe recipe = recipeRepository.findById(recipeId).orElse(null);
        return recipe;
    }

    public List<RecipeForm> getRecipeList(String majorCategory){
        List<Recipe> recipes = recipeRepository.findByMajorCategory(majorCategory);
        return recipes.stream()
                .map(Recipe::toForm)
                .collect(Collectors.toList());

    }

    public List<RecipeIngredientForm> getIngredient(Long id){
        List<RecipeIngredient> ingredients = recipeIngredientRepository.findByRecipeId(id);
        return ingredients.stream()
                .map(RecipeIngredient::toForm)
                .collect(Collectors.toList());
    }

    public List<RecipeStepForm> getRecipeStep(Long id){
        List<RecipeStep> recipeSteps = recipeStepRepository.findByRecipeId(id);
        return recipeSteps.stream()
                .map(RecipeStep::toForm)
                .collect(Collectors.toList());
    }

    public RecipeForm getRecipeInform(Long id){
        Recipe inform = recipeRepository.findById(id).orElse(null);
        return inform.toForm();
    }

    public Recipe createRecipe(RecipeForm form){

        Recipe recipe = form.toEntity();
        recipeRepository.save(recipe);
        return recipe;
    }

    public List<RecipeForm> getMyRecipeList(String userId){
        List<Recipe> myRecipes = recipeRepository.findMyRecipe(userId);
        return myRecipes.stream()
                .map(Recipe::toForm)
                .collect(Collectors.toList());
    }

    @Transactional
    public void deleteRecipe(Long id){
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        recipeStepRepository.deleteStep(recipe.getRecipeId());
        recipeIngredientRepository.deleteIngredient(recipe.getRecipeId());
        recipeRepository.delete(recipe);
    }

    public void updateRatingAvg(Long recipeId){
        List<Double> ratingAvg = allCommentService.getCommentAvg(recipeId);


        Recipe recipe = recipeRepository.findById(recipeId).orElse(null);
        log.info("평점은: " + ratingAvg.get(0));
        recipe.setRatingAvg(ratingAvg.get(0));
        recipeRepository.save(recipe);
    }

    @Transactional
    public void increaseViewNum(Long id, HttpServletRequest request, HttpServletResponse response){
        String cookieName = "viewNum_" + id;

        Cookie[] cookies = request.getCookies();
        boolean alreadyViewed = false;

        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(cookieName)){
                    alreadyViewed = true;
                    break;
                }
            }
        }

        if(!alreadyViewed){
            recipeRepository.updateRecipeView(id);

            Cookie cookie = new Cookie(cookieName, "true");
            cookie.setMaxAge(30);
            response.addCookie(cookie);
        }
    }

    public void getSortRecipe(String categoryName, String sort, Model model){
            List<Recipe> recipes = recipeRepository.findSortRecipe(categoryName, sort);
            model.addAttribute("recipes", recipes);
    }

    public void recipeEditPage(Long id, Model model){
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        List<RecipeStep> steps = recipeStepRepository.findByRecipeId(id);
        List<RecipeIngredient> ingredients = recipeIngredientRepository.findByRecipeId(id);
        model.addAttribute("recipe", recipe);
        model.addAttribute("steps", steps);
        model.addAttribute("ingredients", ingredients);
    }

    @Transactional
    public void editRecipe(Long recipeId, RecipeForm recipeForm, RegistIngredientForm registIngredientForm, RegistStepForm registStepForm, MultipartFile file, List<MultipartFile> stepFile){
        Recipe editRecipe = recipeRepository.findById(recipeId).orElse(null);
        List<RecipeStep> editRecipeStep = recipeStepRepository.findByRecipeId(editRecipe.getRecipeId());
        List<RecipeIngredient> editRecipeIngredient = recipeIngredientRepository.findByRecipeId(editRecipe.getRecipeId());
        editRecipe.setRecipeName(recipeForm.getRecipeName());
        editRecipe.setPortion(recipeForm.getPortion());
        editRecipe.setRunTime(recipeForm.getRunTime());
        editRecipe.setCookLevel(recipeForm.getCookLevel());
        List<String> ingredients = registIngredientForm.getIngredients();
        List<String> quantities = registIngredientForm.getQuantities();
        List<String> stepWays = registStepForm.getStepWays();
        Long stepCount = recipeStepRepository.findStepCount(recipeId);
        Long ingredientCount = recipeIngredientRepository.findIngredientCount(recipeId);
        try {
            String filePath = "C:/LesChef_note/LesChef/src/main/resources/static/uploads/" + file.getOriginalFilename();
            log.info(filePath);
            log.info("file비어있지않음");
            File dest = new File(filePath);
            file.transferTo(dest);
            log.info("여기까지옴2");
            editRecipe.setRecipeImg("/uploads/" + file.getOriginalFilename());

        } catch (IOException e) {}
        recipeRepository.save(editRecipe).getRecipeId();

        try {
            if(stepCount > stepWays.size()){
                for(int i = stepWays.size(); i < stepCount; i++){
                    recipeStepRepository.delete(editRecipeStep.get(i));
                }
            }else if(stepCount < stepWays.size()){
                for(int i = stepCount.intValue(); i < stepWays.size(); i++){
                    RecipeStep newStep = new RecipeStep();
                    newStep.setRecipe(editRecipe);
                    recipeStepRepository.save(newStep);
                }
            }
            List<RecipeStep> newEditRecipeStep = recipeStepRepository.findByRecipeId(editRecipe.getRecipeId());
            for(int i = 0; i < stepWays.size(); i++){
                RecipeStep editStep = newEditRecipeStep.get(i);
                Long stepId = editStep.getRecipeStepId();
                Long stepNum = i+1L;
                String stepWay = stepWays.get(i);
                String stepFilePath = "C:/LesChef_note/LesChef/src/main/resources/static/uploads/" + stepFile.get(i).getOriginalFilename();
                log.info("stepWay의 개수: " + stepWays.size());
                log.info("step의 이미지 경로: " + stepFilePath);
                File stepDest = new File(stepFilePath);
                stepFile.get(i).transferTo(stepDest);
                String stepImg = "/uploads/" + stepFile.get(i).getOriginalFilename();
//                editStep.setRecipe(recipe);
//                editStep.setStepImg("/uploads/" + stepFile.get(i).getOriginalFilename());
//                editStep.setStepWay(stepWays.get(i));
//                editStep.setStepNum(i+1L);
                recipeStepRepository.updateStep(stepId, recipeId, stepNum, stepWay, stepImg);
//                recipeStepRepository.save(recipeStep); //Update사용
            }
        } catch (IOException e) {}

        if(ingredientCount > ingredients.size()){
            for(int i = ingredients.size(); i < ingredientCount; i++){
                recipeIngredientRepository.delete(editRecipeIngredient.get(i));
            }
        }else if(ingredientCount < ingredients.size()){
            for(int i = ingredientCount.intValue(); i < ingredients.size(); i++){
                RecipeIngredient newIngredient = new RecipeIngredient();
                newIngredient.setRecipe(editRecipe);
                recipeIngredientRepository.save(newIngredient);
            }
        }
        List<RecipeIngredient> newEditRecipeIngredient = recipeIngredientRepository.findByRecipeId(editRecipe.getRecipeId());
        for(int i = 0; i < ingredients.size(); i++){
            RecipeIngredient editIngredient = newEditRecipeIngredient.get(i);
            Long ingredientId = editIngredient.getRecipeIngredientId();
            String ingredientName = ingredients.get(i);
            String ingredientVolume = quantities.get(i);
            recipeIngredientRepository.updateIngredient(ingredientId, ingredientName, ingredientVolume, recipeId);
        }
    }
}
