package com.example.LesChef.service;

import com.example.LesChef.dto.CommentForm;
import com.example.LesChef.entity.AllComment;
import com.example.LesChef.repository.AllCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AllCommentService {

    private final AllCommentRepository allCommentRepository;

    public List<CommentForm> getRecipeComment(Long recipeId){
        List<AllComment> comments = allCommentRepository.findRecipeComment(recipeId);
        return comments.stream()
                .map(AllComment::toForm)
                .collect(Collectors.toList());
    }

    public List<CommentForm> getArticleComment(Long articleId){
        List<AllComment> comments = allCommentRepository.findArticleComment(articleId);
        return comments.stream()
                .map(AllComment::toForm)
                .collect(Collectors.toList());
    }
    public List<Double> getCommentAvg(Long recipeId){
        List<AllComment> comments = allCommentRepository.findRecipeComment(recipeId);
        List<Double> doubleList = new ArrayList<>();

        long ratingSum = 0;
        double ratingdecimal = 0.0;
        for(int i=0; i < comments.size(); i++) {
            long commentRating = comments.get(i).getRating();
            ratingSum += commentRating;
        }
        double avg = (double)ratingSum/comments.size();
        double starAvg = Math.round(avg*100)/100.0;
        double ratingAvg = Math.round(avg*10)/10.0;
        doubleList.add(ratingAvg);
//        double decimal = ratingAvg - Math.floor(ratingAvg);
//        if(decimal >= 0.75) {
//            ratingdecimal = 1.0;
//        }else if(decimal >= 0.25){
//            ratingdecimal = 0.5;
//        }else{
//            ratingdecimal = 0.0;
//        }
        int b[] = {};

        for(int i=0; i < 5; i++){
            if(starAvg >= 0.75+i) {
                doubleList.add(1.0);
            }else if(starAvg >= 0.25+i){
                doubleList.add(0.5);
            }else{
                doubleList.add(0.0);;
            }

        }
        return doubleList;
    }



    public List<CommentForm> getMyRecipeComment(String commenter){
        List<AllComment> comments = allCommentRepository.findMyRecipeComment(commenter);
        return comments.stream()
                .map(AllComment::toForm)
                .collect(Collectors.toList());
    }

    public List<CommentForm> getMyArticleComment(String commenter){
        List<AllComment> comments = allCommentRepository.findMyArticleComment(commenter);
        return comments.stream()
                .map(AllComment::toForm)
                .collect(Collectors.toList());
    }

    public void deleteComment(Long id){
        AllComment commentId = allCommentRepository.findById(id).orElse(null);
        allCommentRepository.delete(commentId);
    }
}



