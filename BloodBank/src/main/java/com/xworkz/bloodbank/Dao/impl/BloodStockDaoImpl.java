package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.BloodStockDao;
import com.xworkz.bloodbank.entity.BloodStockEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class BloodStockDaoImpl implements BloodStockDao {


    @Override
    public boolean saveBloodStock(BloodStockEntity bloodStockEntity) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(bloodStockEntity);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getBloodStock() {

//        for (BloodStockEntity stock : bloodStockEntities){
//            System.out.println(stock);
//        }
    }
}
