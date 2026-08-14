package com.xworkz.bloodbank.service.impl;

import com.xworkz.bloodbank.Dao.BloodStockDao;
import com.xworkz.bloodbank.Dao.impl.BloodStockDaoImpl;
import com.xworkz.bloodbank.Dto.BloodStockDto;
import com.xworkz.bloodbank.entity.BloodBankEntity;
import com.xworkz.bloodbank.entity.BloodStockEntity;
import com.xworkz.bloodbank.service.BloodStockService;

public class BloodStockServiceImpl implements BloodStockService {

    BloodStockDao bloodStockDao = new BloodStockDaoImpl();
    @Override
    public boolean saveBloodStock(BloodStockDto bloodStock) {
        BloodStockEntity bloodStockEntity = new BloodStockEntity();
        bloodStockEntity.setStockId(bloodStock.getStockId());

        BloodBankEntity bloodBank = new BloodBankEntity();
        bloodBank.setId(bloodStock.getBankId());
        bloodStockEntity.setBank(bloodBank);

        bloodStockEntity.setBloodGroup(bloodStock.getBloodGroup());
        bloodStockEntity.setAvailableUnits(bloodStock.getAvailableUnits());
        bloodStockEntity.setLastUpdate(bloodStock.getLastUpdate());

        return bloodStockDao.saveBloodStock(bloodStockEntity);
    }

    @Override
    public void getBloodStock() {

        bloodStockDao.getBloodStock();
    }
}
