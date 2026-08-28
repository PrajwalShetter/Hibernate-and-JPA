package com.xworkz.dominoz.entity;

import com.xworkz.dominoz.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_table")

public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private String email;
    private long phone;
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private BigDecimal salary;
    private String password;
}
