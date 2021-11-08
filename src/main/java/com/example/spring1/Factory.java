package com.example.spring1;

import com.example.spring1.service.UserService;
import org.springframework.beans.factory.FactoryBean;

public class Factory implements FactoryBean<UserService> {
    @Override
    public UserService getObject() throws Exception {
        UserService userService = new UserService();
        return userService;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
