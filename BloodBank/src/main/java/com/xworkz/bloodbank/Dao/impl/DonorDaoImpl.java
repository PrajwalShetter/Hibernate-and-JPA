package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.DonorDao;
import com.xworkz.bloodbank.entity.DonorEntity;
import com.xworkz.bloodbank.service.DonorService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class DonorDaoImpl implements DonorDao {


    @Override
    public boolean saveDonor(DonorEntity donor) {

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(donor);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getDonors() {


    }
}
