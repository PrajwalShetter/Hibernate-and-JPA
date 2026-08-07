package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.DonorDao;
import com.xworkz.bloodbank.entity.DonorEntity;
import com.xworkz.bloodbank.service.DonorService;

import java.util.ArrayList;
import java.util.List;

public class DonorDaoImpl implements DonorDao {

    List<DonorEntity> entities = new ArrayList<>();
    @Override
    public boolean saveDonor(DonorEntity donor) {

        return entities.add(donor);
    }

    @Override
    public void getDonors() {
        for (DonorEntity dEntity: entities){
            System.out.println(dEntity);
        }

    }
}
