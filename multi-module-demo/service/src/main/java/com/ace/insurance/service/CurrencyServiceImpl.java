package com.ace.insurance.service;

import com.ace.insurance.model.Currency;
import com.ace.insurance.repository.CurrencyRepository;
import com.ace.insurance.repository.CustomCurrencyRepository;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CustomCurrencyRepository currencyRepository;

    @Override
    @Transactional
    public List<Currency> findAllFilter(boolean isDeleted) {
        return currencyRepository.findAllFilter(isDeleted);
    }

}
