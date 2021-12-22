package com.t3h.news.model.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InsertCategoryRequest {
    private String name;
    private int parentsCategory;
}
