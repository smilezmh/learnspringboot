package com.example.learnspringboot.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethod {
    public void methodService(){
        System.out.println("被拦截的方法2");
    }
}
