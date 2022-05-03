package com.spring.study.exception.controller;

import com.spring.study.exception.dto.User_ex;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/ex")
@Validated //param에 valid
public class ExceptionController {

    @GetMapping("")
    public User_ex get(
            @Size(min = 2)
            @RequestParam(required = false) String name,

            @NotNull
            @Min(1)
            @RequestParam(required = false) Integer age){
        User_ex user_ex = new User_ex();
        user_ex.setName(name);
        user_ex.setAge(age);

        int a = 10+age;
        return user_ex;
    }

    @PostMapping("")
    public User_ex post(@Valid @RequestBody User_ex user_ex){
        System.out.println(user_ex);
        return user_ex;
    }

/*    @ExceptionHandler(value = MethodArgumentNotValidException.class) //현재 위치의 controller 모두(가장우선)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e){
        System.out.println("api exception");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }*/
}
