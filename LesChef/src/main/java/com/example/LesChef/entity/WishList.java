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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wish_list_id_seq")
    @SequenceGenerator(name = "wish_list_id_seq", sequenceName = "wish_list_id_seq", initialValue = 1, allocationSize = 1)
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
