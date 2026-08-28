package com.xworkz.dominoz.dao;

import com.xworkz.dominoz.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDao {

    boolean saveEmployee(EmployeeEntity employeeEntity);
    List<EmployeeEntity> getEmployees();
    EmployeeEntity getEmployeeByPhone(long phone);
    List<EmployeeEntity> getEmployeeByAge(int age);
}
