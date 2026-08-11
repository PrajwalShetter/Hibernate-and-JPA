package com.xworkz.bloodbank.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DonationDto {

    private int id;
    private int donorId;
    private int bloodBankId;
    private Date donationDate;
    private int quantityMl;


}
