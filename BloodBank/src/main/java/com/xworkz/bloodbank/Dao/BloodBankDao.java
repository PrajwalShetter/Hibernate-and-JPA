package com.xworkz.bloodbank.Dao;

import com.xworkz.bloodbank.entity.BloodBankEntity;

public interface BloodBankDao {

    boolean saveBloodBank(BloodBankEntity bloodBank);
    void getBloodbank();
    BloodBankEntity getById(int id);
}
