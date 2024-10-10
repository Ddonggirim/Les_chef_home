package com.example.LesChef.repository;

import com.example.LesChef.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WishListRepository extends JpaRepository<WishList, Long> {

    @Query(value = "select * from Wish_List where RECIPE_ID = :recipeId and ID = :Id", nativeQuery = true)
    WishList findWish(@Param("recipeId") Long recipeId, @Param("Id") String Id);

}
