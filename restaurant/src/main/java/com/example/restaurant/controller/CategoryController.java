package com.example.restaurant.controller;

import com.example.restaurant.model.Category;
import com.example.restaurant.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin({"http://localhost:4200" , "http://localhost:3100/"})

public class CategoryController {
    private CategoryService categoryService ;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("api/allCategories")
    public List<Category> getAllCategories()
    {
        return categoryService.allCategories();
    }
}
