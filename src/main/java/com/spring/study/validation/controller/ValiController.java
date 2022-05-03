package com.spring.study.validation.controller;

import com.spring.study.validation.dto.User_vali;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/vali")
public class ValiController {

    @PostMapping("/user")
    public ResponseEntity user(@Valid @RequestBody User_vali user_vali, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            StringBuilder stringBuilder =new StringBuilder();
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError field = (FieldError) objectError;
                String massage = objectError.getDefaultMessage();
                System.out.println("field :"+field.getField());
                System.out.println(massage);

                stringBuilder.append("field : " +field.getField());
                stringBuilder.append("message : "+massage);
            });

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(stringBuilder.toString());
        }
        System.out.println(user_vali);

        return ResponseEntity.ok( user_vali);

    }

}
