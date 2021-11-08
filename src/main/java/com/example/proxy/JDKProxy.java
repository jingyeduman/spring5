package com.example.proxy;

import com.example.spring1.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {
                UserDao.class
        };
        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDaoImpl());;
        UserDao userDao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, userDaoProxy);
        System.out.println(userDao.add(1, 2));
    }
}

class UserDaoProxy implements InvocationHandler {

    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("pre proxy " + method.getName());
        Object res = method.invoke(obj, args);
        System.out.println("fix proxy");
        return res;
    }
}