package com.xworkz.bloodbank.Dto;

import com.xworkz.bloodbank.constants.BloodGroup;
import com.xworkz.bloodbank.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonorDto {

    private int id;
    private String name;
    private int age;
    private Gender gender;
    private BloodGroup bloodGroup;
    private long phone;
    private String address;

}
