package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.BloodBankDao;
import com.xworkz.bloodbank.entity.BloodBankEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class BloodBankDaoImpl implements BloodBankDao {

    private Configuration configuration = new Configuration();
    private SessionFactory sessionFactory;

    public BloodBankDaoImpl(){
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
    }



    @Override
    public boolean saveBloodBank(BloodBankEntity bloodBank) {


        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(bloodBank);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getBloodbank() {

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        List<BloodBankEntity> result = session.createQuery("from BloodBankEntity", BloodBankEntity.class).getResultList();
        for(BloodBankEntity bloodBank : result){
            System.out.println(bloodBank);
        }
        session.close();
        sessionFactory.close();
    }

    @Override
    public BloodBankEntity getById(int id) {

        Session session = sessionFactory.openSession();

        BloodBankEntity bloodBank = session.get(BloodBankEntity.class,id);
        session.close();
        return bloodBank;
    }
}