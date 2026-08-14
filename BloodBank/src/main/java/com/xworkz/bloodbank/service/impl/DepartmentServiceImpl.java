package com.xworkz.bloodbank.service.impl;

import com.xworkz.bloodbank.Dao.DepartmentDao;
import com.xworkz.bloodbank.Dao.impl.DepartmentDaoImpl;
import com.xworkz.bloodbank.Dto.DepartmentDto;
import com.xworkz.bloodbank.entity.DepartmentEntity;
import com.xworkz.bloodbank.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

    DepartmentDao departmentDao = new DepartmentDaoImpl();
    @Override
    public boolean saveDepartment(DepartmentDto department) {
        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setId(department.getId());
        departmentEntity.setName(department.getName());

        return departmentDao.saveDepartment(departmentEntity);
    }

    @Override
    public void getDepartment() {
        departmentDao.getDepartment();
    }
}
