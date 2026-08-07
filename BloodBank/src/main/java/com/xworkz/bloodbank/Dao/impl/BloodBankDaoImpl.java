package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.BloodBankDao;
import com.xworkz.bloodbank.entity.BloodBankEntity;

import java.util.ArrayList;
import java.util.List;

public class BloodBankDaoImpl implements BloodBankDao {

    List<BloodBankEntity>  bloodBankEntities = new ArrayList<>();
    @Override
    public boolean saveBloodBank(BloodBankEntity bloodBank) {
        return bloodBankEntities.add(bloodBank);
    }

    @Override
    public void getBloodbank() {
        for (BloodBankEntity bloodBank : bloodBankEntities){
            System.out.println(bloodBank);
        }

    }
}
