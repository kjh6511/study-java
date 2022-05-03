package com.spring.study.validation.dto;

import com.spring.study.validation.annotion.YearMonth;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@ToString
public class User_vali {

    @NotEmpty
    private String name;

    @Max(value = 90)
    private int age;

/*    @Email
    private String email;

    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
    private String phoneNumber;

    @YearMonth
    public String reqYearMonth; //yyyyMM*/

    @Valid
    private List<Car_vali> cars;
}
