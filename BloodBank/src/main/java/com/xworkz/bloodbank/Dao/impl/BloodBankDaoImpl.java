package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.BloodBankDao;
import com.xworkz.bloodbank.entity.BloodBankEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

public class BloodBankDaoImpl implements BloodBankDao {


    @Override
    public boolean saveBloodBank(BloodBankEntity bloodBank) {


        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(bloodBank);
        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public void getBloodbank() {
//        for (BloodBankEntity bloodBank : bloodBankEntities){
//            System.out.println(bloodBank);
//        }

    }
}
