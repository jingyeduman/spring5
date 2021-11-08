package com.example.spring1.service;

import com.example.spring1.dao.UserDao;

import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void dump() {
        System.out.println("this is dump");
        String username = this.userDao.getUsername();
        System.out.println("username " + username);
    }
}
