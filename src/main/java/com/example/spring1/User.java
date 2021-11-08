package com.example.spring1;

import org.springframework.beans.BeansException;

public class User {

    private String username;

    public User(String username) {
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void add() {
        System.out.println("out add");
    }

    public void initMethod() {
        System.out.println("this is initMethod");
    }

    public void destoryMethod() {
        System.out.println("this is destoryMethod");
    }

}
