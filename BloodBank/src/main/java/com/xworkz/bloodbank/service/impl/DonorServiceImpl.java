package com.xworkz.bloodbank.service.impl;

import com.xworkz.bloodbank.Dao.DonorDao;
import com.xworkz.bloodbank.Dao.impl.DonorDaoImpl;
import com.xworkz.bloodbank.Dto.DonorDto;
import com.xworkz.bloodbank.entity.DonorEntity;
import com.xworkz.bloodbank.service.DonorService;

public class DonorServiceImpl implements DonorService {
    DonorDao dao = new DonorDaoImpl();

    @Override
    public boolean saveDonor(DonorDto donor) {
        DonorEntity entity= new DonorEntity(donor.getId(), donor.getName(), donor.getAge(),donor.getGender(),donor.getBloodGroup(),
                donor.getPhone(), donor.getAddress());
        return dao.saveDonor(entity);
    }

    @Override
    public void getDonors() {
        dao.getDonors();
    }
}
