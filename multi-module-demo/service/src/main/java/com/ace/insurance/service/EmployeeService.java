package com.ace.insurance.service;

import com.ace.insurance.model.Employee;
import com.ace.insurance.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getEmployees(){
        return repository.getEmployees();
    }
}
