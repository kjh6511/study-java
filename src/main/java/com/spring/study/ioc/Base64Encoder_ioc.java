package com.spring.study.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

//객체로 관리되어야 하기 때문에 스프링에 요청함
//Component는 빈으로 등록된다
//싱글톤형태로 만들어서 스프링에서 직접 관리를 한다
@Component("base64")
public class Base64Encoder_ioc implements IEncoder_ioc {

    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
