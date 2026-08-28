package com.xworkz.dominoz.dto;

import com.xworkz.dominoz.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {

    private  int id;
    private String name;
    private String email;
    private long phone;
    private int age;
    private Gender gender;
    private BigDecimal salary;
    private String password;
}
