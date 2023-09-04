package com.example.ecommercebackend.web.rest;


import com.example.ecommercebackend.domain.CategoryDetail;
import com.example.ecommercebackend.domain.CategoryMain;
import com.example.ecommercebackend.domain.Product;
import com.example.ecommercebackend.service.CategoryDetailService;
import com.example.ecommercebackend.service.CategoryMainService;
import com.example.ecommercebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/product")
public class ProductController
{
    private final ProductService productService ;
    private final CategoryDetailService categoryDetailService ;

    private final CategoryMainService categoryMainService ;
    

    @Autowired
    public ProductController(ProductService productService, CategoryDetailService categoryDetailService, CategoryMainService categoryMainService) {
        this.productService = productService;
        this.categoryDetailService = categoryDetailService;
        this.categoryMainService = categoryMainService;
    }


    @GetMapping("/getProduct")
    public List<Product> getProduct()
    {
        return productService.getProduct();

    }

    @GetMapping("/getByCategoriesId")
    public List<Product> getProductByCategoriesId(Long categoriesId)
    {
        List<CategoryMain> categoryMainList=categoryMainService.getCategoryMainByCategoriesId(categoriesId);
        List<Product> products=new ArrayList<>();
        for (CategoryMain categoryMain:categoryMainList) {

            List<CategoryDetail>categoryDetailList=categoryDetailService.getByCategoryMainId(categoryMain.getId());
            for (CategoryDetail categoryDetail: categoryDetailList) {
                List<Product> productList=productService.getProductByCategoryDetailId(categoryDetail.getId());
                for (Product product:productList) {
                    products.add(product);
                }

            }

        }
        return products ;

    }

    @GetMapping("/getByCategoryMainId")
    public List<Product> getByCategoryMainId(Long categoryMainId)
    {

        List<Product> products=new ArrayList<>();
        List<CategoryDetail>categoryDetailList=categoryDetailService.getByCategoryMainId(categoryMainId);
        for (CategoryDetail categoryDetail: categoryDetailList) {
             List<Product> productList=productService.getProductByCategoryDetailId(categoryDetail.getId());
             for (Product product:productList) {
                 products.add(product);
             }
        }

        return products ;
    }

    @GetMapping("/getByCategoryDetailId")
    public List<Product> getByCategoryDetailId(Long categoryDetailId)
    {
        List<Product> products=new ArrayList<>();
        List<Product> productList=productService.getProductByCategoryDetailId(categoryDetailId);
        for (Product product:productList) {
            products.add(product);
        }

        return products ;
    }
}
