package com.ace.insurance.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name="currency")
@SQLDelete(sql = "UPDATE currency SET deleted = 1 WHERE id = ?")
//@Where(clause = "deleted = 0")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "rates")
    private float rates;

    @Column(name = "fromcurrency")
    private String fromCurrency;

    @Column(name = "tocurrency")
    private String toCurrency;

    @Column(name = "deleted")
    @Setter(AccessLevel.NONE)
    @JsonIgnore
    private boolean deleted;

    // Assigning default 0 value to deleted as if it's existing
    public void setDeleted() {
        this.deleted = false;
    }

    public Currency(int id, float rates, String fromCurrency, String toCurrency, boolean deleted) {
        this.id = id;
        this.rates = rates;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.deleted = deleted;
    }
}
