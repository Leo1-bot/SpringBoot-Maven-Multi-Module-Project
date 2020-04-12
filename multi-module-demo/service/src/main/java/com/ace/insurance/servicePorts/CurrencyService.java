package com.ace.insurance.servicePorts;

import com.ace.insurance.model.Currency;

import java.util.List;
import java.util.Optional;


public interface CurrencyService {

    List<Currency> findAllFilter(boolean isDeleted);
    List<Currency> findAll();
    Optional<Currency> findById(Integer theId);
    void save(Currency theCurrency);
    void deleteById(int theId);
}
