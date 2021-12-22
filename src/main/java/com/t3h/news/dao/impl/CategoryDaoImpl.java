package com.t3h.news.dao.impl;

import com.t3h.news.dao.ICategoryDao;
import com.t3h.news.mapper.CategoryMapper;
import com.t3h.news.model.CategoryModel;
import com.t3h.news.model.request.InsertCategoryRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryDaoImpl extends GenericDaoImpl<CategoryModel> implements ICategoryDao {

    @Override
    public List<CategoryModel> getList() {
        String sql = "select * from category";
        return getList(sql,new CategoryMapper());
    }

    @Override
    public CategoryModel insert(InsertCategoryRequest insertCategoryRequest) {
        return null;
    }

//    @Override
//    public CategoryModel findByProperties(Object... parameters) {
//        return null;
//    }
}