package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.DepartmentDao;
import com.xworkz.bloodbank.entity.DepartmentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {


    @Override
    public boolean saveDepartment(DepartmentEntity departmentEntity) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(departmentEntity);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getDepartment() {

//        for (DepartmentEntity dpt: departmentEntities){
//            System.out.println(dpt);
//        }

    }
}
