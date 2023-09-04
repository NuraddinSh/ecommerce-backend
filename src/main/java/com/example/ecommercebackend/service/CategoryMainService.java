package com.example.ecommercebackend.service;


import com.example.ecommercebackend.domain.Categories;
import com.example.ecommercebackend.domain.CategoryMain;
import com.example.ecommercebackend.repository.CategoryMainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryMainService {

private CategoryMainRepository categoryMainRepository;
@Autowired
public CategoryMainService(CategoryMainRepository categoryMainRepository)
{
    this.categoryMainRepository=categoryMainRepository;
}
    public List<CategoryMain> getCategoryMain(){
        return  categoryMainRepository.findAll();
    }

    public List<CategoryMain> getCategoryMainByCategoriesId(Long id){
        return  categoryMainRepository.findByCategoriesIdOrderById(id);
    }

}
