package com.example.ecommercebackend.repository;

import com.example.ecommercebackend.domain.CategoryMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMainRepository extends JpaRepository<CategoryMain,Long> {


    List<CategoryMain> findByCategoriesIdOrderById(Long id);
}
