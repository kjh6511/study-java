package com.spring.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component //class단위로 등록 (@bean은 method단위로 등록)
public class TimerAop {
    //걸린시간 aop
    @Pointcut("execution(* com.spring.study.aop.controller..*.*(..))")
    private void cut() {}

    @Pointcut("@annotation(com.spring.study.aop.annotation.Timer)")
    public void enableTimer(){}

    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = joinPoint.proceed();

        stopWatch.stop();
        System.out.println("total time :"+stopWatch.getTotalTimeSeconds());
    }
}
