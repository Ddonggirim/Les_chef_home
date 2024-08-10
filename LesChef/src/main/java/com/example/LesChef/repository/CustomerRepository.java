package com.example.LesChef.repository;

import com.example.LesChef.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Override
    Optional<Customer> findById(String id);
    Optional<Customer> findByTel(String tel);
}
