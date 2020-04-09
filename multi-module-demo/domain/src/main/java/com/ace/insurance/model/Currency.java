package com.ace.insurance.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.text.DecimalFormat;

@Data
@NoArgsConstructor
@Entity
@Table(name="currency")
@SQLDelete(sql = "UPDATE currency SET deleted = 1 WHERE id = ?")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "rates")
    @Getter(AccessLevel.NONE)
    private float rates;

    @Column(name = "fromcurrency")
    private String fromCurrency;

    @Column(name = "tocurrency")
    private String toCurrency;

    @Column(name = "deleted")
    @Setter(AccessLevel.NONE)
    @JsonIgnore
    private boolean deleted;

    // Declare decimal format for float value
    @Transient
    DecimalFormat df = new DecimalFormat();

    // Assigning default 0 value to deleted as if it's existing
    public void setDeleted() {
        this.deleted = false;
    }

    public String getRates() {
        df.setMaximumFractionDigits(5);
        return df.format(rates);
    }

    public Currency(int id, float rates, String fromCurrency, String toCurrency, boolean deleted) {
        this.id = id;
        this.rates = rates;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.deleted = deleted;
    }
}
