package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.BloodRequestDao;
import com.xworkz.bloodbank.entity.BloodRequestEntity;

import java.util.ArrayList;
import java.util.List;

public class BloodRequestDaoImpl implements BloodRequestDao {

    List<BloodRequestEntity> requestEntities = new ArrayList<>();
    @Override
    public boolean saveRequest(BloodRequestEntity requestEntity) {
        return requestEntities.add(requestEntity);
    }

    @Override
    public void getRequest() {
        for(BloodRequestEntity entity : requestEntities){
            System.out.println(entity);
        }

    }
}
