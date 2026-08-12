package com.xworkz.bloodbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "donation_table")
@AllArgsConstructor
@NoArgsConstructor
public class DonationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donation_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "donor_id")
    private DonorEntity donor;

    @ManyToOne
    @JoinColumn(name = "bloodBank_id")
    private BloodBankEntity bloodBank;

    @Column(name = "donation_date")
    private Date donationDate;

    @Column(name = "quantity_ml")
    private int quantityMl;
}