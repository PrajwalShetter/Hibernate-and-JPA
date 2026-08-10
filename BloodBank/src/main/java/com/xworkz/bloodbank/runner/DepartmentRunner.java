package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.DepartmentController;
import com.xworkz.bloodbank.Dto.DepartmentDto;

public class DepartmentRunner  {

    public static void main(String[] args) {

        DepartmentController departmentController = new DepartmentController();
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(1);
        departmentDto.setName("Lab Technician");

        departmentController.saveDepartment(departmentDto);
        departmentController.getDepartment();

    }
}
