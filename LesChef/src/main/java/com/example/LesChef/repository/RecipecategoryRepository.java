package com.example.LesChef.repository;

import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipecategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface RecipecategoryRepository extends JpaRepository<Recipecategory, String> {

    @Query(value = "select * from Recipe_Category where ENGLISH_NAME = :englishName", nativeQuery = true)
    Recipecategory findEngName(@Param("englishName") String englishName);
}
