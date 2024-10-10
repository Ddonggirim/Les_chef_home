package com.example.LesChef.entity;

import com.example.LesChef.dto.WishListForm;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long wishListId;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @ManyToOne
    @JoinColumn(name = "id")
    private Customer customer;

    @Builder
    public WishList(Recipe recipe, Customer customer){
        this.recipe  = recipe;
        this.customer = customer;
    }
    public WishListForm toForm(){
        return new WishListForm(this.wishListId, this.recipe, this.customer);
    }
}
