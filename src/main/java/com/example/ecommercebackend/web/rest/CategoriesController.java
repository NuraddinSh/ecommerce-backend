package com.example.ecommercebackend.web.rest;

import com.example.ecommercebackend.service.CategoriesService;
import com.example.ecommercebackend.domain.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/categories")
public class CategoriesController
{
    private final CategoriesService categoriesService ;

    @Autowired
    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }


    @GetMapping("/getCategories")
    public List<Categories> getCategories()
    {
        return categoriesService.getCategories();

    }
}
