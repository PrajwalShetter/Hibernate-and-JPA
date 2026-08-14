package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.Dto.BloodStockDto;
import com.xworkz.bloodbank.entity.BloodStockEntity;

public interface BloodStockService {

    boolean saveBloodStock(BloodStockDto bloodStock);
    void getBloodStock();
}
