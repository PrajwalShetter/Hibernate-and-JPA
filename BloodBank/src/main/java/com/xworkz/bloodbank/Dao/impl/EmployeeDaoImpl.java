package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.EmployeeDao;
import com.xworkz.bloodbank.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {


    @Override
    public boolean saveEmployee(EmployeeEntity employeeEntity) {


        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(employeeEntity);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getEmployee() {

//        for(EmployeeEntity emp: employeeEntities){
//            System.out.println(emp);
//        }
    }
}
