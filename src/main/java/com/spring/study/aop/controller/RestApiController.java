package com.spring.study.aop.controller;

import com.spring.study.aop.annotation.Decode;
import com.spring.study.aop.annotation.Timer;
import com.spring.study.aop.dto.User_aop;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
        return id+" "+name;
    }

    @PostMapping("/post")
    public User_aop post(@RequestBody User_aop userAop){
        return userAop;
    }

    @Timer
    @DeleteMapping("delete/{id}")
    public void delete() throws InterruptedException {
        //db logic 2초뒤 실행
        Thread.sleep(1000*2);

    }

    @Decode
    @PutMapping("/put")
    public User_aop put(@RequestBody User_aop userAop){
        System.out.println("put");
        System.out.println(userAop);
        return userAop;
    }
}
