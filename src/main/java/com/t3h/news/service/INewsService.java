package com.t3h.news.service;

import com.t3h.news.model.entity.News;

import java.util.List;

public interface INewsService {
    List<News> getListNew();
    List<News> save(News news);
}
