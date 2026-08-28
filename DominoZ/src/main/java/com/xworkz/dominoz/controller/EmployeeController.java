package com.xworkz.dominoz.controller;

import com.xworkz.dominoz.dto.EmployeeDto;
import com.xworkz.dominoz.service.EmployeeService;
import com.xworkz.dominoz.service.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {

    EmployeeService employeeService = new EmployeeServiceImpl();

    public boolean saveEmployee(EmployeeDto employeeDto){
        return employeeService.saveEmployee(employeeDto);

    }
    public List<EmployeeDto> getEmployees(){
        return employeeService.getEmployees();
    }

    public EmployeeDto getEmployeeByPhone(long phone){
        return employeeService.getEmployeeByPhone(phone);
    }
    public List<EmployeeDto> getEmployeeByAge(int age){
        return  employeeService.getEmployeeByAge(age);
    }
}
