package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.BloodRequestDao;
import com.xworkz.bloodbank.entity.BloodRequestEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class BloodRequestDaoImpl implements BloodRequestDao {


    @Override
    public boolean saveRequest(BloodRequestEntity requestEntity) {

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(requestEntity);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getRequest() {
//        for(BloodRequestEntity entity : requestEntities){
//            System.out.println(entity);
//        }

    }
}
