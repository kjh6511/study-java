package com.spring.study.ioc;

import com.spring.study.di.IEncoder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder_ioc {

    private IEncoder_ioc iEncoder_ioc;

    //생성자
    public Encoder_ioc(@Qualifier("base64") IEncoder_ioc iEncoder_ioc){
        this.iEncoder_ioc = iEncoder_ioc;
    }

    public void setIEncoder_ioc(IEncoder_ioc iEncoder_ioc){
        this.iEncoder_ioc = iEncoder_ioc;
    }


    public String encode(String message){
        return iEncoder_ioc.encode(message);
    }
}
