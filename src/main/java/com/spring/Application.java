package com.spring;

import com.spring.study.ioc.Base64Encoder_ioc;
import com.spring.study.ioc.Encoder_ioc;
import com.spring.study.ioc.UrlEncoder_ioc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;

@SpringBootApplication
@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println(Base64.getEncoder().encodeToString("steve@gmail.com".getBytes()));
    }

}

@Configuration
class AppConfig{
    //빈생성
    @Bean("base64Encode")
    public Encoder_ioc encoder_ioc(Base64Encoder_ioc base64Encoder_ioc){
        return new Encoder_ioc(base64Encoder_ioc);
    }

    @Bean("urlEncode")
    public Encoder_ioc encoder_ioc(UrlEncoder_ioc urlEncoder_ioc){
        return new Encoder_ioc(urlEncoder_ioc);
    }
}

