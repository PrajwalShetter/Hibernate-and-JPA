package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.PatientDao;
import com.xworkz.bloodbank.entity.PatientEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl implements PatientDao {


    @Override
    public boolean savePatient(PatientEntity patient) {

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(patient);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getPatient() {
//            for(PatientEntity patient:patientEntities){
//                System.out.println(patient);
//            }
    }
}
