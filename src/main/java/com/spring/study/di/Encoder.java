package com.spring.study.di;

import org.apache.catalina.util.URLEncoder;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;

    //생성자
    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }


    public String encode(String message){
        return iEncoder.encode(message);
    }
}
