package com.example.LesChef.controller;

import com.example.LesChef.dto.*;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.RecipeIngredient;
import com.example.LesChef.entity.RecipeStep;
import com.example.LesChef.repository.CustomerRepository;
import com.example.LesChef.repository.RecipeIngredientRepository;
import com.example.LesChef.repository.RecipeStepRepository;
import com.example.LesChef.service.*;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MypageController {

    private final CustomerService customerService;

    private final CustomerRepository customerRepository;

    private final RecipeService recipeService;

    private final ArticleService articleService;

    private final AllCommentService allCommentService;

    private final WishListService wishListService;

    private final RecipeStepRepository recipeStepRepository;

    private final RecipeIngredientRepository recipeIngredientRepository;

    // 회원정보 수정
    @PostMapping("/customerRewrite")
    public String customerEdit(AddCustomerRequest dto, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String currentId = currentUser.getId();
        log.info("현재 유저ID:" + currentId);

        customerService.edit(dto, currentId);

        session.invalidate();
        return "redirect:/main";
    }

    // 회원 탈퇴
    @PostMapping("/customerDelete")
    public String customerDelete(HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        customerRepository.delete(currentUser);
        session.invalidate();
        return "redirect:/main";
    }

    @GetMapping("myWishList")
    public String wishList(Model model, HttpSession session){
        Customer currentUser = (Customer) session.getAttribute("customer");
        String userId = currentUser.getId();
        wishListService.getMyWishList(userId, model);
        return "mypage/WishList";
    }

    //나의 댓글 가져오기
    @GetMapping("/myRecipeComment")
    public String recipeComment(Model model, HttpSession session) {
        Customer currentUser = (Customer) session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        List<CommentForm> commentForms = allCommentService.getMyRecipeComment(nickname);
        model.addAttribute("RecipeComment", commentForms);
        return "mypage/Mycomment";

    }
    @GetMapping("/myArticleComment")
    public String articleComment(Model model, HttpSession session){
        Customer currentUser = (Customer) session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        List<CommentForm> commentForms = allCommentService.getMyArticleComment(nickname);
        model.addAttribute("ArticleComment", commentForms);
        return "mypage/Mycomment";
    }

    //나의 레시피, 게시글 가져오기
    @GetMapping("/myrecipe")
    public String myRecipeList(Model model, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        log.info("나의 레시피 목록");
        List<RecipeForm> recipeForm = recipeService.getMyRecipeList(nickname);
        model.addAttribute("myRecipes", recipeForm);
        return "mypage/Myrecipe";
    }

    @GetMapping("/myarticle")
    public String myArticleList(Model model, HttpSession session){
        Customer currentUser = (Customer)session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        log.info("article요청");
        List<ArticleForm> articleForms = articleService.getMyArticleList(nickname);
        log.info("article요청2");
        model.addAttribute("myArticles", articleForms);
        return "mypage/Myrecipe";
    }

    //레시피, 게시글 삭제
    @PostMapping("/recipe/delete/{id}")
    public String delRecipe(@PathVariable("id") Long id){
        allCommentService.deleteRecipeParent(id);
        wishListService.recipeDeleteWish(id);
        recipeService.deleteRecipe(id);
        return "redirect:/myrecipe";
    }
    @PostMapping("/article/delete/{id}")
    public String delArticle(@PathVariable("id") Long id){
        allCommentService.deleteArticleParent(id);
        articleService.deleteArticle(id);
        return "redirect:/myarticle";
    }

    // 댓글 삭제 및 삭제 게시글 종류 확인
    @PostMapping("/comment/delete/{id}")
    public String delComment(@PathVariable("id") Long id){
        String postType = allCommentService.deleteComment(id);
        if(postType != "recipeType"){
            return "redirect:/myArticleComment";
        }else{
            return "redirect:/myRecipeComment";
        }

    }

    @PostMapping("/wish/delete/{id}")
    public String delWish(@PathVariable("id") Long id){
        wishListService.deleteWish(id);
        return "redirect:/myWishList";
    }

    @PostMapping("/Recipe/create")
    public String createList(@ModelAttribute RecipeForm recipeForm, @ModelAttribute RegistIngredientForm registIngredientForm, @ModelAttribute RegistStepForm registStepForm, @RequestParam("File") MultipartFile file,
                             @RequestParam("stepFiles[]") List<MultipartFile> stepFile, HttpSession session){ //mutipartfile로 변환할 수 없는데 input의 name을 form의 이름과 똑같게해서 안됨
        log.info("Recipe/create호출");
        Customer currentUser = (Customer)session.getAttribute("customer");
        String nickname = currentUser.getNickname();
        List<String> ingredients = registIngredientForm.getIngredients();   //재료이름들
        List<String> quantities = registIngredientForm.getQuantities();     //재료수량들
        List<String> stepImgs = registStepForm.getStepImgs();
        List<String> stepWays = registStepForm.getStepWays();
        log.info("stepFile의 크기: " + stepFile.get(0).getOriginalFilename());


        log.info("레시피등록요청");
        recipeForm.setUserId(nickname);

        try {
            String filePath = "C:/LesChef_note/LesChef/src/main/resources/static/uploads/" + file.getOriginalFilename();
            log.info(filePath);
            log.info("file비어있지않음");
            File dest = new File(filePath);
            file.transferTo(dest);
            log.info("여기까지옴2");
            recipeForm.setRecipeImg("/uploads/" + file.getOriginalFilename());

        } catch (IOException e) {}
        Recipe recipe = recipeService.createRecipe(recipeForm);
        try {
            for(int i = 0; i < stepWays.size(); i++){
                RecipeStep recipeStep = new RecipeStep();
                String stepFilePath = "C:/LesChef_note/LesChef/src/main/resources/static/uploads/" + stepFile.get(i).getOriginalFilename();
                log.info("stepWay의 개수: " + stepWays.size());
                log.info("step의 이미지 경로: " + stepFilePath);
                File stepDest = new File(stepFilePath);
                stepFile.get(i).transferTo(stepDest);
                recipeStep.setRecipe(recipe);
//                recipeStep.setStep_Img(stepImgs.get(i));
                recipeStep.setStepImg("/uploads/" + stepFile.get(i).getOriginalFilename());
                recipeStep.setStepWay(stepWays.get(i));
                recipeStep.setStepNum(i+1L);
                recipeStepRepository.save(recipeStep);
            }
        } catch (IOException e) {}

        log.info("재료이름의 수:" + ingredients.size());
        log.info("재료수량:" + quantities.size());

        // 파일을 지정된 경로에 저장
        for(int i = 0; i < ingredients.size(); i++){
            RecipeIngredient recipeIngredient = new RecipeIngredient();
            log.info("재료 이름:"+ingredients.get(i));
            recipeIngredient.setRecipe(recipe);
            recipeIngredient.setIngredientName(ingredients.get(i));
            recipeIngredient.setIngredientVolume(quantities.get(i));
            recipeIngredientRepository.save(recipeIngredient);
        }
        return "redirect:/myrecipe";


    }

    @PostMapping("/recipe/editPage/{id}")
    public String recipeEditPage(@PathVariable("id") Long id, Model model){
        recipeService.recipeEditPage(id, model);
        return "mypage/RecipeEdit";
    }
}
