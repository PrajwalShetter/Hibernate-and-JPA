package com.xworkz.bloodbank.entity;

import com.xworkz.bloodbank.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_table")

public class EmployeeEntity {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "dprt_id")
    private DepartmentEntity department;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "employee_designation")
    private  String designation;

    @Column(name = "employee_phone")
    private long phone;

    @Column(name = "employee_salary")
    private double salary;

    @Column(name = "joining_date")
    private Date joining_date;

}
