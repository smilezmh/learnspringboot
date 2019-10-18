package com.example.learnspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiConfig {
    @Bean
    public FunctionService functionService()
    {
        return new FunctionService();
    }

//    @Bean
//    public UseFunctionService useFunctionService(){
//        UseFunctionService useFunctionService=new UseFunctionService();
//        useFunctionService.setFunctionService(functionService());
//        return useFunctionService;
//    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService)
    {
        UseFunctionService useFunctionService=new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
