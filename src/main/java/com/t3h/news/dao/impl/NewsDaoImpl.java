package com.t3h.news.dao.impl;

import com.t3h.news.dao.INewsDao;
import com.t3h.news.model.entity.News;
import org.springframework.stereotype.Component;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class NewsDaoImpl implements INewsDao {
    // lay danh sach cac bai new trong co so du lieu

    //1: tao connect den co so du lieu

    // tao ra query

    // thuc thi cau lenh vao co so du lie

//     nap du lieu tu bang vao class obj
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/24h";
        String username = "root";
        String password = "123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    public List<News> getNews(){
        Connection connection = this.getConnection();
        String sql = "select * from news";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<News> listNews = new ArrayList<>();
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            resultSet =  preparedStatement.executeQuery();

            while (resultSet.next()){
                News news = new News();
                news.setId(Integer.parseInt(resultSet.getString("id")));
                news.setTitle(resultSet.getString("title"));
                news.setAvatar(resultSet.getString("avatar"));
                news.setCreatorId(Integer.parseInt(resultSet.getString("creatorId")));
                news.setAuthor(resultSet.getString("author"));
                news.setEditorId(Integer.parseInt(resultSet.getString("editorId")));
                listNews.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listNews;
    }

    @Override
    public List<News> saveNews(News news) {
        Statement statement;
        try {
            statement = this.getConnection().createStatement();
            String title = news.getTitle();
            String sql = "insert into news values (null,'"+ title +"',null ,null,null ,null,'1' ,'1',null ,null,null ,null, null )";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.getNews();
    }
}
