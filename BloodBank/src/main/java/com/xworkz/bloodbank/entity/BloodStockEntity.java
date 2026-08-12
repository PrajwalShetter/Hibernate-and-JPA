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
@Table(name = "bloodStock_table")
public class BloodStockEntity {

    @Id
    @Column(name = "stock_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stockId;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private BloodBankEntity bank;

    @Column(name = "blood_group")
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Column(name = "available_units")
    private int availableUnits;

    @Column(name = "last_update")
    private Date lastUpdate;
}
