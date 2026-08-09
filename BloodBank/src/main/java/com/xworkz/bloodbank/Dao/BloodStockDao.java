package com.xworkz.bloodbank.Dao;

import com.xworkz.bloodbank.entity.BloodStockEntity;

public interface BloodStockDao {

    boolean saveBloodStock(BloodStockEntity bloodStockEntity);
    void getBloodStock();

}
