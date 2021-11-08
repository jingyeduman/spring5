package com.example.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    @Before("execution(* com.example.aopanno.User.add(..))")
    public void before() {
        System.out.println("before");
    }
    

}
