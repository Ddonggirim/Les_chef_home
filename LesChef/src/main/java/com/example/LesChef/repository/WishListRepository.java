package com.example.LesChef.repository;

import com.example.LesChef.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WishListRepository extends JpaRepository<WishList, Long> {

    @Query(value = "select * from Wish_List where RECIPE_ID = :recipeId and ID = :Id", nativeQuery = true)
    WishList findWish(@Param("recipeId") Long recipeId, @Param("Id") String Id);

    @Modifying
    @Query(value = "delete from Wish_List where Recipe_Id = :recipeId", nativeQuery = true)
    void deleteRecipe(@Param("recipeId") Long recipeId);

    @Query(value = "select * from Wish_List where Id = :Id", nativeQuery = true)
    List<WishList> findMyWishList(@Param("Id") String Id);
}
