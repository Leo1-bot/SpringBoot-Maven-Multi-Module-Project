package com.ace.insurance.serviceAdapters;

import com.ace.insurance.model.Currency;
import com.ace.insurance.repository.CurrencyRepository;
import com.ace.insurance.repositoryPorts.CustomCurrencyRepository;
import com.ace.insurance.servicePorts.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CustomCurrencyRepository customCurrencyRepository;

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    @Transactional
    public List<Currency> findAllFilter(boolean isDeleted) {
        return customCurrencyRepository.findAllFilter(isDeleted);
    }

    @Override
    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

}
