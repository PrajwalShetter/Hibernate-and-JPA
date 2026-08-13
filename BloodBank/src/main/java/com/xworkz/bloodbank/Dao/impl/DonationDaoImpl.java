package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.DonationDao;
import com.xworkz.bloodbank.entity.DonationEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class DonationDaoImpl implements DonationDao {


    @Override
    public boolean saveDonation(DonationEntity donation) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(donation);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getDonation() {

//        for(DonationEntity donation1 : donationEntity){
//
//            System.out.println(donation1);
//        }
    }
}
