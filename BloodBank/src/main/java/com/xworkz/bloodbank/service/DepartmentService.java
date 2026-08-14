package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.Dto.DepartmentDto;
import com.xworkz.bloodbank.entity.DepartmentEntity;

public interface DepartmentService {

    public boolean saveDepartment(DepartmentDto department);
    void getDepartment();
}
