package com.spring.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class ParameterAop {

    //aop를 통한 디버깅
    @Pointcut("execution(* com.spring.study.aop.controller..*.*(..))")
    private void cut() {}

    @Before("cut()")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName());

        //들어온 객체 값
        Object[] args = joinPoint.getArgs();
        for(Object obj:args){
            System.out.println("type : "+obj.getClass().getSimpleName());
            System.out.println("value :"+obj);
        }
    }

    @AfterReturning(value = "cut()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj){
        System.out.println("returnObj :");
        System.out.println(returnObj);
    }

}
