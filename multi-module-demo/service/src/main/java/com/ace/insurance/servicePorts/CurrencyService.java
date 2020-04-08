package com.ace.insurance.servicePorts;

import com.ace.insurance.model.Currency;

import java.util.List;


public interface CurrencyService {

    List<Currency> findAllFilter(boolean isDeleted);

}
