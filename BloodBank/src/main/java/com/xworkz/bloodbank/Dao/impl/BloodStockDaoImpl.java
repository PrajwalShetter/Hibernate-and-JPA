package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.BloodStockDao;
import com.xworkz.bloodbank.entity.BloodStockEntity;

import java.util.ArrayList;
import java.util.List;

public class BloodStockDaoImpl implements BloodStockDao {

    List<BloodStockEntity> bloodStockEntities = new ArrayList<>();
    @Override
    public boolean saveBloodStock(BloodStockEntity bloodStockEntity) {
      return bloodStockEntities.add(bloodStockEntity);
    }

    @Override
    public void getBloodStock() {

        for (BloodStockEntity stock : bloodStockEntities){
            System.out.println(stock);
        }
    }
}
