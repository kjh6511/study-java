package com.spring.study.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class IocMain {

    public static void main(String[] args) {
        ApplicationContext context = ApplicationContextProvider.getContext();

        //Base64Encoder_ioc base64Encoder_ioc = context.getBean(Base64Encoder_ioc.class);
        //UrlEncoder_ioc urlEncoder_ioc = context.getBean(UrlEncoder_ioc.class);
        //Encoder_ioc encoder_ioc = new Encoder_ioc(base64Encoder_ioc);
        Encoder_ioc encoder_ioc = context.getBean("base64Encode", Encoder_ioc.class);
        String url = "www.naver.com/books/it?page=10$size=20";
        String result = encoder_ioc.encode(url);
        System.out.println(result);

/*        encoder_ioc.setIEncoder_ioc(urlEncoder_ioc);
        result = encoder_ioc.encode(url);
        System.out.println(result);*/
    }
}
