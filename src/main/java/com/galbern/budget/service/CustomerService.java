package com.galbern.budget.service;

import com.galbern.budget.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    public Customer addCustomer(Customer c);
    public List<Customer> fundCustomers();
    public Customer findCustomer(Long id);
    public Customer editCustomer(Long id);
    public Customer deleteCustomer(Long id);
}
