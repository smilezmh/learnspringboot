package com.example.learnspringboot;

import com.example.learnspringboot.aop.AopConfig;
import com.example.learnspringboot.aop.DemoAnnotationService;
import com.example.learnspringboot.aop.DemoMethod;
import com.example.learnspringboot.config.DiConfig;
import com.example.learnspringboot.config.FunctionService;
import com.example.learnspringboot.config.UseFunctionService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class LearnspringbootApplication {

    public static void main(String[] args) {

       // SpringApplication.run(LearnspringbootApplication.class, args);
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
//
//        UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);
//        FunctionService functionService=context.getBean(FunctionService.class);
//
//        System.out.println(useFunctionService.sayHello("hellosfsf"));
//        System.out.println(functionService.sayHello());
//        context.close();


        AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService=context1.getBean(DemoAnnotationService.class);
        DemoMethod demoMethod=context1.getBean(DemoMethod.class);
        demoAnnotationService.add();
        System.out.println("---------");
        demoMethod.methodService();
        context1.close();
    }

}
