package com.spring.study.filter.controller;

import com.spring.study.filter.dto.User_fi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/filter/temp")
public class FilterControllr {

    @PostMapping("")
    public User_fi user(@RequestBody User_fi user_fi){
        log.info("temp : {}", user_fi);
        return user_fi;
    }
}
