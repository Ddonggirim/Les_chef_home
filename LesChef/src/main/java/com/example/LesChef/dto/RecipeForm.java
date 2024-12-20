package com.example.LesChef.dto;

import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecipeForm {
    private Long recipeId;
    @NotEmpty(message="레시피의 이름을 입력해 주세요")
    private String recipeName;
    private Long viewNum;
    private Date writeDate; /*Date*/
    private String runTime;
    private String portion;/*몇인분*/
    private String cookLevel;
    private Customer userId;
    private String recipeImg;
    private String majorCategory;
    private String subCategory;
    private Double ratingAvg;

    public Recipe toEntity() {
        return Recipe.builder()
                .recipeName(this.recipeName)
                .viewNum(0L)
                .writeDate(Date.valueOf(LocalDate.now()))
                .runTime(this.runTime)
                .portion(this.portion)
                .cookLevel(this.cookLevel)
                .userId(this.userId)
                .recipeImg(this.recipeImg)
                .majorCategory("공유")
                .subCategory(null)
                .ratingAvg(this.ratingAvg != null ? this.ratingAvg : 0)
                .build();
    }
}

