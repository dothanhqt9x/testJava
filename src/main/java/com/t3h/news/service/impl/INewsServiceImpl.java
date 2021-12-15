package com.t3h.news.service.impl;

import com.t3h.news.dao.INewsDao;
import com.t3h.news.model.entity.News;
import com.t3h.news.service.INewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INewsServiceImpl implements INewsService {
        private INewsDao iNewsDao;

        public INewsServiceImpl(INewsDao iNewsDao){
                this.iNewsDao = iNewsDao;
        }

        public List<News> getListNew(){
                return iNewsDao.getNews();
        }

        @Override
        public List<News> save(News news) {
                return iNewsDao.saveNews(news);
        }


}
