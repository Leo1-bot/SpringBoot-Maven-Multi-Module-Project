package com.ace.insurance.web;

import com.ace.insurance.model.Currency;
import com.ace.insurance.repository.CurrencyRepository;
import com.ace.insurance.servicePorts.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/")
    public String index(Model theModel) {
        List<Currency> currencyList = currencyService.findAll();
        theModel.addAttribute("currencyList", currencyList);
        return "index";
    }

}
