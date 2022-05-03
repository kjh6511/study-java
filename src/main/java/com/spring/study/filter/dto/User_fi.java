package com.spring.study.filter.dto;

import lombok.*;

@Data //get,set,ToString,hasCode,Equals ...
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //전체 생성자
public class User_fi {
    private String name;
    private int age;
}
