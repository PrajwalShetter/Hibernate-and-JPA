package com.xworkz.bloodbank.entity;

import com.xworkz.bloodbank.constants.BloodGroup;
import com.xworkz.bloodbank.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "donor_table")
@Entity
//@RequiredArgsConstructor
public class DonorEntity {

    @Id
    @Column(name = "donor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "donor_name")
    private String name;

    @Column(name = "donor_age")
    private int age;

    @Column(name = "donor_gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "donor_bloodGroup")
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Column(name = "donor_phone")
    private long phone;

    @Column(name = "donor_address")
    private String address;
}
