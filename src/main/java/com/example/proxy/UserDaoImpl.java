package com.example.proxy;

import com.example.proxy.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
