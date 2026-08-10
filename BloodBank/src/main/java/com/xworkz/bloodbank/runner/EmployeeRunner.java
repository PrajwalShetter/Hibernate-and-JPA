package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.EmployeeController;
import com.xworkz.bloodbank.Dto.EmployeeDto;
import com.xworkz.bloodbank.constants.Gender;

public class EmployeeRunner {

    public static void main(String[] args) {

        EmployeeController employeeController = new EmployeeController();
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(1);
        employeeDto.setDepartmentId(1);
        employeeDto.setName("Nithin");
        employeeDto.setDesignation("manager");
        employeeDto.setGender(Gender.MALE);
        employeeDto.setPhone(990088990022L);
        employeeDto.setSalary(40000);
        employeeDto.setJoining_date(java.sql.Date.valueOf("2026-09-10"));

        employeeController.saveEmployee(employeeDto);
        employeeController.getEmployee();


    }
}
