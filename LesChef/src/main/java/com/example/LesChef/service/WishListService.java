package com.example.LesChef.service;

import com.example.LesChef.entity.WishList;
import com.example.LesChef.repository.WishListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListService {

    private final WishListRepository wishListRepository;

    public WishList getWish(Long recipeId, String userId){
        WishList wishList = wishListRepository.findWish(recipeId, userId);
        return wishList;
    }

    public WishList wishSave(WishList wishList){
        WishList wish= wishListRepository.save(wishList);
        return wish;
    }
}
