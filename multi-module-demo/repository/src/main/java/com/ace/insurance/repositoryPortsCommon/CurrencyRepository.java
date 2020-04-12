package com.ace.insurance.repositoryPortsCommon;

import com.ace.insurance.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currencies")
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}

