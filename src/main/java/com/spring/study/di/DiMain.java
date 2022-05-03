package com.spring.study.di;

public class DiMain {
    public static void main(String[] args) {
        String url="www.naver.com/books/it?page=10$size=20";

        //원하는걸로 선택
        //Encoder encoder = new Encoder(new Base64Encoder());
        Encoder encoder = new Encoder(new UrlEncoder());

        String result = encoder.encode(url);
        System.out.println(result);
    }
}
