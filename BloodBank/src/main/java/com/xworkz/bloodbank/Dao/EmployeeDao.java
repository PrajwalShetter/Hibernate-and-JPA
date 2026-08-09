package com.xworkz.bloodbank.Dao;

import com.xworkz.bloodbank.entity.EmployeeEntity;

public interface EmployeeDao {

    boolean saveEmployee(EmployeeEntity employeeEntity);
    void getEmployee();
}
