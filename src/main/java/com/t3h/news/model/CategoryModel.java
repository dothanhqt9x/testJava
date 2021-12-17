package com.t3h.news.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryModel{
    private int id;

    private String name;

    private int parentsCategory;
}