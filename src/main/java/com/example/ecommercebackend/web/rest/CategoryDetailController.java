package com.example.ecommercebackend.web.rest;

import com.example.ecommercebackend.domain.CategoryDetail;
import com.example.ecommercebackend.domain.CategoryMain;
import com.example.ecommercebackend.service.CategoryDetailService;
import com.example.ecommercebackend.service.CategoryMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/categoryDetail")
public class CategoryDetailController
{
    private final CategoryDetailService categoryDetailService ;

    @Autowired
    public CategoryDetailController(CategoryDetailService categoryDetailService) {
        this.categoryDetailService = categoryDetailService;
    }


    @GetMapping("/getCategoryDetail")
    public List<CategoryDetail> getCategoriesDetail()
    {
        return categoryDetailService.getCategoryDetail();

    }

    @GetMapping("/getByCategoryMainId")
    public List<CategoryDetail> getByCategoryMainId(Long id)
    {
        return categoryDetailService.getByCategoryMainId(id);

    }
}
