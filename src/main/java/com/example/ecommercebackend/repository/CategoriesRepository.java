package com.example.ecommercebackend.repository;

import com.example.ecommercebackend.domain.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Long> {
}
