package com.ace.insurance.service;

import com.ace.insurance.model.Currency;
import com.ace.insurance.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyRepository theRepository;

    @Override
    @Transactional
    public List<Currency> findAll() {
        return theRepository.findAll();
    }

    @Override
    public Currency findById(int theId) {
        return null;
    }

    @Override
    public void save(Currency theCurrency) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
