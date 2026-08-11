package com.xworkz.bloodbank.Dto;

import com.xworkz.bloodbank.constants.BloodGroup;
import com.xworkz.bloodbank.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PatientDto {
     private int id;
     private String patientName;
     private Gender gender;
     private BloodGroup bloodGroup;
     private String hospitalName;
     private String address;


}
