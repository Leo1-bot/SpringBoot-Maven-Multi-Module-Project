package com.ace.insurance.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="currencytbl")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "rates")
    private float rate;
    @Column(name = "fromcurrency")
    private String fromCurrency;
    @Column(name = "tocurrency")
    private String toCurrency;
}
