package com.example.ecommercebackend.service;


import com.example.ecommercebackend.domain.Product;
import com.example.ecommercebackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

private ProductRepository productRepository;
@Autowired
public ProductService(ProductRepository productRepository)
{
    this.productRepository=productRepository;
}
    public List<Product> getProduct(){
        return  productRepository.findAll();
    }

    public List<Product> getProductByCategoryDetailId(Long id){
        return  productRepository.getProductByCategoryDetailIdOrderById(id);
    }

}
