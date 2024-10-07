package com.example.LesChef.entity;

import com.example.LesChef.dto.WishListForm;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WishList {
    @Id
    private Long wishListId;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @ManyToOne
    @JoinColumn(name = "id")
    private Customer customer;


//    public WishListForm toForm(){
//        return new WishListForm(this.wishListId, this.recipe, this.customer);
//    }
}
