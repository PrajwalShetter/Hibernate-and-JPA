package com.xworkz.bloodbank.Controller;

import com.xworkz.bloodbank.service.impl.DepartmentServiceImpl;
import com.xworkz.bloodbank.Dto.DepartmentDto;
import com.xworkz.bloodbank.service.DepartmentService;

public class DepartmentController {

    DepartmentService departmentService = new DepartmentServiceImpl();
    public  boolean saveDepartment(DepartmentDto department){
        return departmentService.saveDepartment(department);
    }
    public void getDepartment(){
        departmentService.getDepartment();
    }
}
