package com.example.ecommercebackend.repository;

import com.example.ecommercebackend.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> getProductByCategoryDetailIdOrderById(Long id);
}
