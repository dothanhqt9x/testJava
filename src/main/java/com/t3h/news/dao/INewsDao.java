package com.t3h.news.dao;

import com.t3h.news.model.entity.News;

import java.util.List;

public interface INewsDao {
    List<News> getNews();
    List<News> saveNews(News news);
}
