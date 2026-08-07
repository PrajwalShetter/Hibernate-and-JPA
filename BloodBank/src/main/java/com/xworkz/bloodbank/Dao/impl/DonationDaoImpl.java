package com.xworkz.bloodbank.Dao.impl;

import com.xworkz.bloodbank.Dao.DonationDao;
import com.xworkz.bloodbank.entity.DonationEntity;

import java.util.ArrayList;
import java.util.List;

public class DonationDaoImpl implements DonationDao {

List<DonationEntity> donationEntity = new ArrayList<>();
    @Override
    public boolean saveDonation(DonationEntity donation) {


        return donationEntity.add(donation);
    }

    @Override
    public void getDonation() {

        for(DonationEntity donation1 : donationEntity){

            System.out.println(donation1);
        }
    }
}
