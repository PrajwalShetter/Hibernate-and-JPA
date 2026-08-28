package com.xworkz.dominoz.service.impl;

import com.xworkz.dominoz.dao.EmployeeDao;
import com.xworkz.dominoz.dao.impl.EmployeeDaoImpl;
import com.xworkz.dominoz.dto.EmployeeDto;
import com.xworkz.dominoz.entity.EmployeeEntity;
import com.xworkz.dominoz.service.EmployeeService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public boolean saveEmployee(EmployeeDto employeeDto) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDto.getId());
        employeeEntity.setAge(employeeDto.getAge());
        employeeEntity.setName(employeeDto.getName());
        employeeEntity.setEmail(employeeDto.getEmail());
        employeeEntity.setGender(employeeDto.getGender());
        employeeEntity.setSalary(employeeDto.getSalary());
        employeeEntity.setId(employeeDto.getId());
        employeeEntity.setPassword(employeeDto.getPassword());
        employeeDao.saveEmployee(employeeEntity);

        return true;
    }

    @Override
    public List<EmployeeDto> getEmployees() {

       EmployeeDao employeeDao = new EmployeeDaoImpl();
       List<EmployeeEntity> employeeEntities = employeeDao.getEmployees();
       List<EmployeeDto> employeeDtos = new ArrayList<>();

       employeeEntities.forEach(employeeEntity->{
           if(employeeEntity != null){
               EmployeeDto employeeDto = new EmployeeDto();
               employeeDto.setId(employeeEntity.getId());
               employeeDto.setAge(employeeEntity.getAge());
               employeeDto.setName(employeeEntity.getName());
               employeeDto.setEmail(employeeEntity.getEmail());
               employeeDto.setGender(employeeEntity.getGender());
               employeeDto.setPassword(employeeEntity.getPassword());
               employeeDto.setPhone(employeeEntity.getPhone());
               employeeDto.setSalary(employeeEntity.getSalary());
               employeeDtos.add(employeeDto);
           }
       });

        return employeeDtos;
    }

    @Override
    public EmployeeDto getEmployeeByPhone(long phone) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        EmployeeDto employeeDto = new EmployeeDto();
        EmployeeEntity employeeEntity=employeeDao.getEmployeeByPhone(phone);

        if(employeeEntity != null){
            employeeDto.setId(employeeEntity.getId());
            employeeDto.setName(employeeEntity.getName());
            employeeDto.setEmail(employeeEntity.getEmail());
            employeeDto.setPhone(employeeEntity.getPhone());
            employeeDto.setAge(employeeEntity.getAge());
            employeeDto.setPassword(employeeEntity.getPassword());
            employeeDto.setGender(employeeEntity.getGender());
            employeeDto.setSalary(employeeEntity.getSalary());

        }
        return employeeDto;
    }

    @Override
    public List<EmployeeDto> getEmployeeByAge(int age) {

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        List<EmployeeEntity> employeeEntities = employeeDao.getEmployeeByAge(age);
        List<EmployeeDto> employeeDtos = new ArrayList<>();

        employeeEntities.forEach(employeeEntity -> {

            if(employeeEntity!= null){
                EmployeeDto employeeDto = new EmployeeDto();
                employeeDto.setId(employeeEntity.getId());
                employeeDto.setSalary(employeeEntity.getSalary());
                employeeDto.setGender(employeeEntity.getGender());
                employeeDto.setAge(employeeEntity.getAge());
                employeeDto.setPhone(employeeEntity.getPhone());
                employeeDto.setEmail(employeeEntity.getEmail());
                employeeDto.setPassword(employeeEntity.getPassword());
                employeeDto.setName(employeeEntity.getName());
                employeeDtos.add(employeeDto);
            }
        });
        return employeeDtos;
    }
}
