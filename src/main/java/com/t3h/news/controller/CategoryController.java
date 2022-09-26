package com.t3h.news.controller;

import com.t3h.news.model.CategoryModel;
import com.t3h.news.service.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private ICategoryService iCategoryService;

    public CategoryController(ICategoryService iCategoryService){
        this.iCategoryService = iCategoryService;
    }

    @GetMapping()
    public ResponseEntity<List<CategoryModel>> getList(){
        return ResponseEntity.ok(iCategoryService.getList());
    }

    @PostMapping()
    public ResponseEntity<CategoryModel> insert(@RequestBody InsertCategoryRequest insertCategoryRequest){
        iCategoryService.insert(insertCategoryRequest);
        return ResponseEntity.ok(iCategoryService.insert(insertCategoryRequest));
    }
}
