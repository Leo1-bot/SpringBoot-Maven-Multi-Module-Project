package com.ace.insurance.repositoryPorts;

import com.ace.insurance.model.Currency;

import java.util.List;

public interface CustomCurrencyRepository{

    List<Currency> findAllFilter(boolean isDeleted);

}
