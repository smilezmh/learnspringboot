package com.example.learnspringboot.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.learnspringboot")
@EnableAspectJAutoProxy
public class AopConfig {
}
