package com.xworkz.bloodbank.Controller;

import com.xworkz.bloodbank.Dto.EmployeeDto;
import com.xworkz.bloodbank.service.EmployeeService;
import com.xworkz.bloodbank.service.impl.EmployeeServiceImpl;

public class EmployeeController {

    EmployeeService employeeService = new EmployeeServiceImpl();
    public boolean saveEmployee(EmployeeDto employee){
        return employeeService.saveEmployee(employee);
    }
    public void getEmployee(){
        employeeService.getEmployee();
    }
}
