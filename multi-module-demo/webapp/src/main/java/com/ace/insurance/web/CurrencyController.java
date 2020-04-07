package com.ace.insurance.web;

import com.ace.insurance.model.Currency;
import com.ace.insurance.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/currency")
public class CurrencyController {

//    @Autowired
//    private CurrencyService theService;
//
//    @GetMapping("/lists")
//    public String listCurrency(Model theModel) {
//
//        List<Currency> theCurrencies = theService.findAll();
//
//        theModel.addAttribute("currencies", theCurrencies);
//
//        return "currency";
//    }
}
