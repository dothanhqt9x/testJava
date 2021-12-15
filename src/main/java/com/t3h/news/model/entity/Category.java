package com.t3h.news.model.entity;

import lombok.Data;

@Data
public class Category {
    private int id;
    private String name;
    private int parentsCategory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentsCategory() {
        return parentsCategory;
    }

    public void setParentsCategory(int parentsCategory) {
        this.parentsCategory = parentsCategory;
    }
}
