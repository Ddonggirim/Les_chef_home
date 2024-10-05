package com.example.LesChef.repository;

import com.example.LesChef.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Override
    Optional<Customer> findById(String id);
//    Optional<Customer> findByTel(String tel);

    @Query(value = "select id from Customer where name = :name and tel = :tel ")
    String findId(@Param("name") String name, @Param("tel") String tel);
}
