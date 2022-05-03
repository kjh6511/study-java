package com.spring.study.exception.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class User_ex {
    @NotEmpty
    @Size(min = 1, max = 100)
    private String name;

    @Min(1)
    @NotNull
    private Integer age;
}
