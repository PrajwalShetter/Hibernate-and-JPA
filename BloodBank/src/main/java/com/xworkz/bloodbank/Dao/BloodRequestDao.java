package com.xworkz.bloodbank.Dao;

import com.xworkz.bloodbank.entity.BloodRequestEntity;

public interface BloodRequestDao {

    boolean saveRequest(BloodRequestEntity requestEntity);
    void getRequest();
}
