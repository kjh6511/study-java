package com.spring.study.filter.controller;

import com.spring.study.filter.dto.User_fi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/filter/user")
public class FilterUserControllr {

    @PostMapping("")
    public User_fi user(@RequestBody User_fi user_fi){
        log.info("User : {}", user_fi);
        return user_fi;
    }
}
