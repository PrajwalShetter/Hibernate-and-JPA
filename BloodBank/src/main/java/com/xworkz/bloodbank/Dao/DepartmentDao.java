package com.xworkz.bloodbank.Dao;

import com.xworkz.bloodbank.entity.DepartmentEntity;

public interface DepartmentDao {

    boolean saveDepartment(DepartmentEntity departmentEntity);
    void getDepartment();
}
