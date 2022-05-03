package com.spring.study.interceptor.controller;

import com.spring.study.interceptor.annotation.Auth;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/in/private")
@Auth //@auth가 있으면 있을때만 통과
public class PrivateController {

    @GetMapping("/hello")
    public String hello(){
        return "private hello";
    }

}
