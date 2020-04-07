package com.ace.insurance.api;

import com.ace.insurance.model.Currency;
import com.ace.insurance.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestController
public class CurrencyRestController {

    @Autowired
    private CurrencyService service;

//  Getting currency data as filtered by isDeleted
    @GetMapping("/currencies/filter")
    public ResponseEntity<List<Currency>> getAllCurrency(
            @RequestParam(value = "isDeleted") boolean isDeleted){
        List<Currency> currencies = service.findAllFilter(isDeleted);
        return new ResponseEntity<>(currencies, HttpStatus.OK);
    }
}
