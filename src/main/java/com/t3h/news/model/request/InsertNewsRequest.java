package com.t3h.news.model.request;

import com.t3h.news.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsertNewsRequest extends BaseModel {

    private int id;

    private String title;

    private String content;

    private String avatar;

    private String author;

    private int categoryId;

    private String originalResource;

    private int numberAccess;

    private int censor;


}