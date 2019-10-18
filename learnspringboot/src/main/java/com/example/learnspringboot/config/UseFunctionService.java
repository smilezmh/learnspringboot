package com.example.learnspringboot.config;

import com.example.learnspringboot.config.FunctionService;


public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService)
    {
        this.functionService=functionService;
    }

    public String sayHello(String word)
    {
        return functionService.sayHello();
    }
}
