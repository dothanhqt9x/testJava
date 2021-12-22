package com.t3h.news.service;

import com.t3h.news.model.CategoryModel;
import com.t3h.news.model.request.InsertCategoryRequest;

import java.util.List;

public interface ICategoryService {

    List<CategoryModel> getList();

    CategoryModel insert(InsertCategoryRequest insertCategoryRequest);
}