package com.example.LesChef.service;

import com.example.LesChef.entity.WishList;
import com.example.LesChef.repository.WishListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

@Slf4j
@Service
@RequiredArgsConstructor
public class WishListService {

    private final WishListRepository wishListRepository;

    public void getWish(Long recipeId, String userId, Model model){
        log.info("getWish안 전");
        WishList wishList = wishListRepository.findWish(recipeId, userId);

        if(wishList != null){
            model.addAttribute("heartImg", "../image1/ListIcon/하트100.png");
        }else{
            model.addAttribute("heartImg", "../image1/ListIcon/하트빈100.png");
        }
        log.info("getWish안 후");

    }

    public WishList wishSave(WishList wishList){
        WishList wish = wishListRepository.save(wishList);
        return wish;
    }
    @Transactional
    public void wishDelete(Long recipeId, String userId){
        WishList wish = wishListRepository.findWish(recipeId, userId);
        wishListRepository.delete(wish);

    }
    @Transactional
    public void recipeDeleteWish(Long recipeId){
        wishListRepository.deleteRecipe(recipeId);
    }
}
