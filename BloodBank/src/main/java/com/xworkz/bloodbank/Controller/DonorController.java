package com.xworkz.bloodbank.Controller;

import com.xworkz.bloodbank.Dto.DonorDto;
import com.xworkz.bloodbank.service.DonorService;
import com.xworkz.bloodbank.service.impl.DonorServiceImpl;

public class DonorController {

    DonorService service= new DonorServiceImpl();

    public boolean saveDonor(DonorDto donor){
        return service.saveDonor(donor);
    }

    public void getDonors(){
        service.getDonors();
    }

}
