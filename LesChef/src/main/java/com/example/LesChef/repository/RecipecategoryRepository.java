package com.example.LesChef.repository;

import com.example.LesChef.entity.Customer;
import com.example.LesChef.entity.Recipecategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RecipecategoryRepository extends JpaRepository<Recipecategory, String> {
}
