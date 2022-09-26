package com.t3h.news.dao;

import com.t3h.news.model.CategoryModel;
import com.t3h.news.model.request.InsertCategoryRequest;

import java.util.List;

public interface ICategoryDao extends IGenericDAO<CategoryModel>{

    List<CategoryModel> getList();

    CategoryModel insert(InsertCategoryRequest insertCategoryRequest);

    @Override
    void insert(String sql, Object... parameters);
}