package com.xworkz.bloodbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bloodBank_table")
public class BloodBankEntity {

    @Id
    @Column(name = "bloodBank_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "bloodBank_name")
    private String name;

    @Column(name = "bloodBank_address")
    private String address;

    @Column(name = "bloodBank_phone")
    private long phone;
}
