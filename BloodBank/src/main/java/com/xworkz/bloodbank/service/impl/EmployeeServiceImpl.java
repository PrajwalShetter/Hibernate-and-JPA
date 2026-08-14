package com.xworkz.bloodbank.service.impl;

import com.xworkz.bloodbank.Dao.EmployeeDao;
import com.xworkz.bloodbank.Dao.impl.EmployeeDaoImpl;
import com.xworkz.bloodbank.Dto.EmployeeDto;
import com.xworkz.bloodbank.entity.DepartmentEntity;
import com.xworkz.bloodbank.entity.EmployeeEntity;
import com.xworkz.bloodbank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDao employeeDao = new EmployeeDaoImpl();
    @Override
    public boolean saveEmployee(EmployeeDto employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employee.getId());
        employeeEntity.setName(employee.getName());
        employeeEntity.setDesignation(employee.getDesignation());
        employeeEntity.setGender(employee.getGender());
        employeeEntity.setPhone(employee.getPhone());
        employeeEntity.setJoining_date(employee.getJoining_date());

        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setId(employee.getId());
        employeeEntity.setDepartment(departmentEntity);

        employeeEntity.setSalary(employee.getSalary());

        return employeeDao.saveEmployee(employeeEntity);
    }

    @Override
    public void getEmployee() {
        employeeDao.getEmployee();

    }
}
