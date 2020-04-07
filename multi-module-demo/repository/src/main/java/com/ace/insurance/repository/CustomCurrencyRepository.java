package com.ace.insurance.repository;

import com.ace.insurance.model.Currency;

import java.util.List;

public interface CustomCurrencyRepository{

    List<Currency> findAllFilter(boolean isDeleted);

}
