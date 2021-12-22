package com.t3h.news.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewsModel extends BaseModel{
//    private int id;

    private String title;

    private String content;

    private String avatar;

    private String author;

    private int categoryId;

    private String originalResource;

    private int numberAcess;

    private int censor;
}