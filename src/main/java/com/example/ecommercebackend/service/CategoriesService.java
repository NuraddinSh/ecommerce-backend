package com.example.ecommercebackend.service;

import com.example.ecommercebackend.domain.Categories;
import com.example.ecommercebackend.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

private CategoriesRepository categoriesRepository;
@Autowired
public CategoriesService(CategoriesRepository categoriesRepository)
{
    this.categoriesRepository=categoriesRepository;
}
    public List<Categories> getCategories(){
        return  categoriesRepository.findAll();
    }

}
