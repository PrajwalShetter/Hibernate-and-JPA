package com.xworkz.bloodbank.Controller;

import com.xworkz.bloodbank.Dto.BloodStockDto;
import com.xworkz.bloodbank.entity.BloodStockEntity;
import com.xworkz.bloodbank.service.BloodStockService;
import com.xworkz.bloodbank.service.impl.BloodStockServiceImpl;

public class BloodStockController {

    BloodStockService bloodStockService = new BloodStockServiceImpl();

    public boolean saveBloodStock(BloodStockDto bloodStock){
        return bloodStockService.saveBloodStock(bloodStock);
    }
    public void getBloodStock(){
        bloodStockService.getBloodStock();
    }
}
