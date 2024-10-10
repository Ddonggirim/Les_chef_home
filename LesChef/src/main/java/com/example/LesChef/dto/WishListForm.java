package com.example.LesChef.dto;

import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.entity.WishList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WishListForm {

    private Long wishListId;
    private Recipe recipe;
    private Customer customer;

    public WishList toEntity(){
        return WishList.builder()
                .recipe(this.recipe)
                .customer(this.customer)
                .build();
    }

}
