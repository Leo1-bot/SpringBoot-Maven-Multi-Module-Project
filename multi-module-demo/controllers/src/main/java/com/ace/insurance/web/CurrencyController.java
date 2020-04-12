package com.ace.insurance.web;

import com.ace.insurance.model.Currency;
import com.ace.insurance.servicePorts.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.List;
import java.util.Optional;

@Controller
@Component
public class CurrencyController {

    private Currency currencyModel;
    private Optional<Currency> currency;

    @PostConstruct
    public void init(){
        currencyModel = new Currency();
    }

    public Currency getCurrencyModel() {
        return currencyModel;
    }

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/")
    public String gridView() {
        return "/grid.xhtml";
    }

    public List<Currency> currencyList(){
        return currencyService.findAllFilter(false);
    }

    public void saveCurrency(Currency theCurrency){
        try{
            currency = currencyService.findById(theCurrency.getId());
            currencyService.save(theCurrency);

        }catch (Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
                    (FacesMessage.SEVERITY_ERROR, "Error!", e.toString()));
        }finally {
            if (!currency.isPresent()){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
                        (FacesMessage.SEVERITY_INFO, "Info", "Added Successfully."));
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
                        (FacesMessage.SEVERITY_INFO, "Info", "Updated Successfully."));
            }
            currencyModel = new Currency();
        }
    }

    public void deleteCurrency(int theId){
        try{
            currencyService.deleteById(theId);
        }catch (Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
                    (FacesMessage.SEVERITY_INFO, "Info", e.toString()));
        }finally {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
                    (FacesMessage.SEVERITY_INFO, "Info", "Deleted Successfully."));
        }

    }

    public void updateCurrency(int theId){
        Optional<Currency> theCurrency = currencyService.findById(theId);
        theCurrency.ifPresent(currency -> currencyModel = currency);
    }

    public void cancel(){
        currencyModel = new Currency();
    }



}
