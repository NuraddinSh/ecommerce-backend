package com.example.ecommercebackend.service;


import com.example.ecommercebackend.domain.CategoryDetail;
import com.example.ecommercebackend.repository.CategoryDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryDetailService {

private CategoryDetailRepository categoryDetailRepository;
@Autowired
public CategoryDetailService(CategoryDetailRepository categoryDetailRepository)
{
    this.categoryDetailRepository=categoryDetailRepository;
}
    public List<CategoryDetail> getCategoryDetail(){
        return  categoryDetailRepository.findAll();
    }

    public List<CategoryDetail> getByCategoryMainId(Long id){
        return  categoryDetailRepository.findByCategoryMainIdOrderById(id);
    }

}
