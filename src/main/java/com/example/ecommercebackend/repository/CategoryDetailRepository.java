package com.example.ecommercebackend.repository;

import com.example.ecommercebackend.domain.CategoryDetail;
import com.example.ecommercebackend.domain.CategoryMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDetailRepository extends JpaRepository<CategoryDetail,Long> {
    List<CategoryDetail> findByCategoryMainIdOrderById(Long id);

}
