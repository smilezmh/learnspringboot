package com.example.learnspringboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 定义切面
 */
@Aspect
@Component
public class LogAspect {

    /**
     *  注解式的拦截，需要定义拦截规则，定义一个切点，有Action注解的地方就需要拦截
     */
    @Pointcut("@annotation(com.example.learnspringboot.aop.Action)")
    public void cut(){
        // 没有什么卵用只是个切点
        System.out.println("cutsdfsfjjl距离近 jhhs");
    }

    /**
     * 注解式拦截，再切点之前
     * @param joinPoint
     */
    @Before("cut()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("拦截前，拦截参数: "+action.name());

    }

    @After("cut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("拦截后，拦截参数： "+action.name());
    }

    /**
     * 方法式拦截不需要显示指定切点，可以直接定义要拦截的类对象
     * @param joinPoint
     */
    @Before("execution(* com.example.learnspringboot.aop.DemoMethod*.*())")
    public void cut2before(JoinPoint joinPoint)
    {
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("拦截前，被拦截的方法"+method.getName());
    }

    @After("execution(* com.example.learnspringboot.aop.DemoMethod*.*())")
    public void cut2after(JoinPoint joinPoint)
    {
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("拦截后：被拦截的方法"+method.getName());
    }
}
