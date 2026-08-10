package com.xworkz.bloodbank.runner;

import com.xworkz.bloodbank.Controller.BloodStockController;
import com.xworkz.bloodbank.Dto.BloodStockDto;
import com.xworkz.bloodbank.constants.BloodGroup;

public class BloodStockRunner {
    public static void main(String[] args) {

        BloodStockController bloodStockController = new BloodStockController();
        BloodStockDto bloodStockDto = new BloodStockDto();
        bloodStockDto.setStockId(1);
        bloodStockDto.setBankId(1);
        bloodStockDto.setBloodGroup(BloodGroup.AB_POSITIVE);
        bloodStockDto.setBankId(1);
        bloodStockDto.setAvailableUnits(25);
        bloodStockDto.setLastUpdate(java.sql.Date.valueOf("2026-10-19"));

        bloodStockController.saveBloodStock(bloodStockDto);
        bloodStockController.getBloodStock();


    }
}
