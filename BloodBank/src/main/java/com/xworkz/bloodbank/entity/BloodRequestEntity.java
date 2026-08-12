package com.xworkz.bloodbank.entity;


import com.xworkz.bloodbank.constants.BloodGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bloodRequest_table")

public class BloodRequestEntity {

    @Id
    @Column(name = "request_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int requestId;

    @ManyToOne
    @JoinColumn(name ="patient_id" )
    private PatientEntity patient;

    @ManyToOne
    @JoinColumn(name ="bank_id")
    private BloodBankEntity bank;

    @Column(name = "request_bloodGroup")
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Column(name = "request_unit")
    private int units;

    @Column(name = "request_date")
    private Date requestDate;

    @Column(name = "request_status")
    private String status;
}
