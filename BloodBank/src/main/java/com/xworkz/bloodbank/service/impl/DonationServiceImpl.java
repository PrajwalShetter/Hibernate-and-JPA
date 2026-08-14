package com.xworkz.bloodbank.service.impl;

import com.xworkz.bloodbank.Dao.DonationDao;
import com.xworkz.bloodbank.Dao.impl.DonationDaoImpl;
import com.xworkz.bloodbank.Dto.DonationDto;
import com.xworkz.bloodbank.entity.BloodBankEntity;
import com.xworkz.bloodbank.entity.DonationEntity;
import com.xworkz.bloodbank.entity.DonorEntity;
import com.xworkz.bloodbank.service.DonationService;

public class DonationServiceImpl implements DonationService {

    DonationDao donationDao = new DonationDaoImpl();
    @Override
    public boolean saveDonation(DonationDto donation) {
        DonationEntity donationEntity = new DonationEntity();
        donationEntity.setId(donation.getId());

        DonorEntity donor = new DonorEntity();
        donor.setId(donation.getDonorId());
        donationEntity.setDonor(donor);

        BloodBankEntity bank = new BloodBankEntity();
        bank.setId(donation.getBloodBankId());
        donationEntity.setBloodBank(bank);


        donationEntity.setDonationDate(donation.getDonationDate());
        donationEntity.setQuantityMl(donation.getQuantityMl());
        return donationDao.saveDonation(donationEntity);
    }

    @Override
    public void getDonation() {
            donationDao.getDonation();
    }
}
