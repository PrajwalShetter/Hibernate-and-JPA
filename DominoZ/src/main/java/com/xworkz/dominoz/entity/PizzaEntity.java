package com.xworkz.dominoz.entity;

import com.xworkz.dominoz.constants.Category;
import com.xworkz.dominoz.constants.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="pizza_table")
@Entity

public class PizzaEntity {

    @Id
    @Column(name = "pizza_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pizza_name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "pizza_size")
    private Size size;

    @Column(name = "pizza_category")
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "pizza_price")
    private double price;
}
