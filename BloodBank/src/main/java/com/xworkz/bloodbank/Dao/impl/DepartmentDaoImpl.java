package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.DepartmentDao;
import com.xworkz.bloodbank.entity.DepartmentEntity;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {

    List<DepartmentEntity> departmentEntities= new ArrayList<>();
    @Override
    public boolean saveDepartment(DepartmentEntity departmentEntity) {
        return departmentEntities.add(departmentEntity);
    }

    @Override
    public void getDepartment() {

        for (DepartmentEntity dpt: departmentEntities){
            System.out.println(dpt);
        }

    }
}
