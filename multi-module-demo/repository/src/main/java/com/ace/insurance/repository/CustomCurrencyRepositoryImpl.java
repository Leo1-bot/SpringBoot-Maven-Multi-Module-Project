package com.ace.insurance.repository;

import com.ace.insurance.model.Currency;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomCurrencyRepositoryImpl implements CustomCurrencyRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Currency> findAllFilter(boolean isDeleted) {
        Session session = entityManager.unwrap(Session.class);
        Query<Currency> query = session.createQuery("FROM Currency WHERE deleted LIKE :isDeleted", Currency.class);
        if(isDeleted){
            query.setParameter("isDeleted", true);
        }else{
            query.setParameter("isDeleted", false);
        }
        return query.getResultList();
    }
}
