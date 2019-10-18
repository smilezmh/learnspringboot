package com.example.learnspringboot.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name="我是拦截参数")
    public void add() {
        System.out.println("被拦截的函数SSS");
    }
}
