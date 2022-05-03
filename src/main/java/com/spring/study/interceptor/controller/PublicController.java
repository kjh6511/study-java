package com.spring.study.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/in/public")
public class PublicController {
    //주로 인증단계를 처리하거나 Logging하는데 사용한다.
    //Filter와 유사하지만 차이점은 Spring Context에 등록된다.

    @GetMapping("/hello")
    public String hello(){
        return "public hello";
    }

}
