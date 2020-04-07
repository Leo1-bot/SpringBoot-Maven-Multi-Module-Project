package com.ace.insurance.service;

import com.ace.insurance.model.Currency;

import java.util.List;


public interface CurrencyService {

    List<Currency> findAll();

    Currency findById(int theId);

    void save(Currency theCurrency);

    void deleteById(int theId);
}
