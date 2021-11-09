package com.example.jdbc;

interface BookDao {
    public int add(UserEntity user);

    int count();

    UserEntity queryRow(int userId);
}
