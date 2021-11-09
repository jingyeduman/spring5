package com.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public int add(UserEntity user) {
        return bookDao.add(user);
    }

    public int count() {
        return bookDao.count();
    }

    public UserEntity queryRow(int userId) {
        return bookDao.queryRow(userId);
    }
}
