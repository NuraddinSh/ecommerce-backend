package com.example.ecommercebackend.web.rest;

import com.example.ecommercebackend.domain.Categories;
import com.example.ecommercebackend.domain.CategoryMain;
import com.example.ecommercebackend.service.CategoriesService;
import com.example.ecommercebackend.service.CategoryMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/categoryMain")
public class CategoryMainController
{
    private final CategoryMainService categoryMainService ;

    @Autowired
    public CategoryMainController(CategoryMainService categoryMainService) {
        this.categoryMainService = categoryMainService;
    }


    @GetMapping("/getCategoryMain")
    public List<CategoryMain> getCategoryMain()
    {
        return categoryMainService.getCategoryMain();

    }

    @GetMapping("/getByCategoriesId")
    public List<CategoryMain> getCategoryMainByCategoriesId(Long id)
    {
        return categoryMainService.getCategoryMainByCategoriesId(id);

    }
}
