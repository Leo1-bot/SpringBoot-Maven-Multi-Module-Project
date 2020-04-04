package com.ace.insurance.repository;

import com.ace.insurance.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "aa", "something1"));
        employees.add(new Employee(2, "bb", "something2"));
        employees.add(new Employee(3, "cc", "something3"));
        employees.add(new Employee(4, "dd", "something4"));
        employees.add(new Employee(5, "ee", "something5"));
        return employees;
    }
}
