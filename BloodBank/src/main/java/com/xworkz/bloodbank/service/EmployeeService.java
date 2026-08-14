package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.Dto.EmployeeDto;
import com.xworkz.bloodbank.entity.EmployeeEntity;

public interface EmployeeService {

    boolean saveEmployee(EmployeeDto employee);
    void getEmployee();
}
