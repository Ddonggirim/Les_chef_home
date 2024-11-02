package com.example.LesChef.service;

import com.example.LesChef.dto.CommentForm;
import com.example.LesChef.entity.AllComment;
import com.example.LesChef.entity.Article;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipe;
import com.example.LesChef.repository.AllCommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class AllCommentService {

    private final AllCommentRepository allCommentRepository;

    //inform,gesigeul 댓글 가져오기
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


    // inform별점
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
//        int b[] = {};
        // 별점의 기준
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


    //마이페이지 레시피, 게시글 댓글 가져오기
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


    //마이페이지 댓글 삭제
    public String deleteComment(Long id){
        AllComment comment = allCommentRepository.findById(id).orElse(null);
        //삭제되는 댓글의 Recipe_Id 유무에 따른 리다이렉트
        String postType;
        if(comment.getRecipe() != null){
            postType = "recipeType";
        }else{
            postType = "articleType";
        }
        allCommentRepository.delete(comment);
        return postType;
    }


    //마이페이지 레시피, 게시글 삭제 시 밑 댓글 삭제
    @Transactional
    public void deleteRecipeParent(Long recipeId){
        allCommentRepository.deleteRecipeComment(recipeId);
    }
    @Transactional
    public void deleteArticleParent(Long articleId){
        allCommentRepository.deleteArticleComment(articleId);
    }

    // article 댓글 추가
    public void insertArticleComment(CommentForm commentForm, Customer currentUser, Article article){
        commentForm.setRecipe(null);
        commentForm.setArticle(article);
        log.info("article은 : " + article.getArticleId());
        commentForm.setCommenter(currentUser);
        AllComment comment = commentForm.toEntity();
        allCommentRepository.save(comment);
    }

    // recipe 댓글 추가
    public void insertRecipeComment(CommentForm commentForm, Customer currentUser, List<CommentForm> comments, Recipe recipe){
        String userNickName = currentUser.getNickname();
        // 평점 중복 방지로 이미 댓글을 쓴 사용자인지 확인
        for(CommentForm comment : comments){
            if(comment.getCommenter().getNickname().equals(userNickName)) {
                //리다이렉트 메시지로 하나의 댓글만 입력할 수 있다 출력
                return;
            }
        }
        commentForm.setRecipe(recipe);
        commentForm.setArticle(null);
        commentForm.setCommenter(currentUser);
        AllComment saveComment = commentForm.toEntity();
        allCommentRepository.save(saveComment);
    }
}



