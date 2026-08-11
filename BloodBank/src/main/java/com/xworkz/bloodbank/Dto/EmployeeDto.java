package com.xworkz.bloodbank.Dto;

import com.xworkz.bloodbank.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto   {

    private int id;
    private int departmentId;
    private String name;
    private Gender gender;
    private  String designation;
    private long phone;
    private double salary;
    private Date joining_date;


}
