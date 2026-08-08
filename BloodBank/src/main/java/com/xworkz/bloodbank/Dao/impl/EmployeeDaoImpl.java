package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.EmployeeDao;
import com.xworkz.bloodbank.entity.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    List<EmployeeEntity> employeeEntities = new ArrayList<>();
    @Override
    public boolean saveEmployee(EmployeeEntity employeeEntity) {
        return employeeEntities.add(employeeEntity);
    }

    @Override
    public void getEmployee() {

        for(EmployeeEntity emp: employeeEntities){
            System.out.println(emp);
        }
    }
}
