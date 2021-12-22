package com.t3h.news.dao.impl;

import com.t3h.news.dao.INewsDao;
import com.t3h.news.mapper.NewsMapper;
import com.t3h.news.model.NewsModel;
import com.t3h.news.model.request.InsertNewsRequest;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class INewsDaoImpl extends GenericDaoImpl<NewsModel> implements INewsDao {

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/24h";
        String user = "root";
        String password = "123456";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }


    public List<NewsModel> getList(){
        String sql = "select * from news";
        return this.getList(sql, new NewsMapper());
    }

    public int insert(InsertNewsRequest insertNewsRequest){
        String sql = "insert into news(title,content,avatar,author,categoryId,originalResource,numberAcess,censor,createDate,updateDate) " +
                "values (?,?,?,?,?,?,?,?,?,?)";
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        insert(sql, insertNewsRequest.getTitle(),
                insertNewsRequest.getContent(),
                insertNewsRequest.getAvatar(),
                insertNewsRequest.getAuthor(),
                insertNewsRequest.getCategoryId(),
                insertNewsRequest.getOriginalResource(),
                insertNewsRequest.getNumberAccess(),
                insertNewsRequest.getCensor(),
                currentTime,
                currentTime
                );
        return 0;
    }

    public List<NewsModel> findByProperties(int numberAccess,int  censor){
        String sql = "select * from news where numberAcess = ? and censor = ? ";
        return findByProperties(sql,new NewsMapper(),numberAccess,censor);
    }

    @Override
    public void updateById(int id, InsertNewsRequest insertNewsRequest) {
        String sql = "update news" +
                " set title = ?," +
                "content = ?," +
                "avatar=?," +
                "author=?," +
                "categoryId=?," +
                "originalResource=?," +
                "numberAcess=?, " +
                "censor=?" +
                " where id=?";
        insert(sql, insertNewsRequest.getTitle(),
                insertNewsRequest.getContent(),
                insertNewsRequest.getAvatar(),
                insertNewsRequest.getAuthor(),
                insertNewsRequest.getCategoryId(),
                insertNewsRequest.getOriginalResource(),
                insertNewsRequest.getNumberAccess(),
                insertNewsRequest.getCensor(),
                id);
    }

    @Override
    public void delete(int id) {
        String sql = "delete from news " +
                "where id="+id;
        delete(sql);
    }


//    @Override
//    public NewsModel findByProperties(Object... parameters) {
//        return null;
//    }
}