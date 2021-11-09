package com.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(UserEntity user) {
        int update = jdbcTemplate.update("insert into t_user(`username`) values(?)", user.getUsername());
        return update;
    }

    @Override
    public int count() {
        String sql = "select count(*) from t_user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public UserEntity queryRow(int userId) {
        String sql = "select * from t_user where user_id = " + userId;
        return jdbcTemplate.queryForObject(sql, UserEntity.class);
    }

}
