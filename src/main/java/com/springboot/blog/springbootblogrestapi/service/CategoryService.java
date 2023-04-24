package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.CategoryDto;

import java.util.List;

public interface CategoryService {
    public CategoryDto addCategory(CategoryDto categoryDto);
    public CategoryDto getCategory(Long categoryId);
    public List<CategoryDto> getAllCategory();



}
