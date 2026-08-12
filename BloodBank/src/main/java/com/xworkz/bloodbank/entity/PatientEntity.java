package com.xworkz.bloodbank.entity;

import com.xworkz.bloodbank.constants.BloodGroup;
import com.xworkz.bloodbank.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patient_table")
@Entity
public class PatientEntity {

    @Id
    @Column(name="patient_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "patient_gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "patient_bloodGroup")
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Column(name = "patient_admittedHospital")
    private String hospitalName;

    @Column(name = "patient_address")
    private String address;


}
