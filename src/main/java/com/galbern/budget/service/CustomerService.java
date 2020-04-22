package com.galbern.budget.service;

import com.galbern.budget.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface CustomerService {
    public Customer addCustomer(Customer c);
    public Set<Customer> getCustomers();
    public Customer findCustomer(Long id);
    public Customer editCustomer(Long id);
    public Customer deleteCustomer(Long id);


}
