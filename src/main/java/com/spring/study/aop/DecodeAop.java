package com.spring.study.aop;

import com.spring.study.aop.dto.User_aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@Aspect
@Component
public class DecodeAop {
    //암복호화 aop  암호화및 특정회사만 변경할때
    @Pointcut("execution(* com.spring.study.aop.controller..*.*(..))")
    private void cut() {
    }

    @Pointcut("@annotation(com.spring.study.aop.annotation.Decode)")
    public void enableDecode() {
    }

    @Before("cut() && enableDecode()")
    public void before(JoinPoint joinPoint) throws UnsupportedEncodingException {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof User_aop) {// arg가 User Object인가
                User_aop userAop = User_aop.class.cast(arg); //User로 형변환
                String base64Email = userAop.getEmail();
                String email = new String(Base64.getDecoder().decode(base64Email), "UTF-8");
                userAop.setEmail(email);
            }
        }
    }

    @AfterReturning(value = "cut() && enableDecode()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj) {
        if(returnObj instanceof User_aop){
            User_aop userAop = User_aop.class.cast(returnObj); //User로 형변환
            String email = userAop.getEmail();
            String base64Email = Base64.getEncoder().encodeToString(email.getBytes());
            userAop.setEmail(email);
        }
    }
}
