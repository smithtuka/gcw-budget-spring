package com.galbern.budget.service.Impl;

import com.galbern.budget.dao.CustomerDao;
import com.galbern.budget.domain.Customer;
import com.galbern.budget.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.swing.text.DefaultEditorKit;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer addCustomer(Customer c){
      return customerDao.save(c);
    }

    @Override
    public Set<Customer> getCustomers() {
        Set<Customer> customers = new HashSet<>();
         customers.addAll(customerDao.findAll());
        return customers;
    }

    @Override
    public Customer findCustomer(Long id) {
        return null;
    }

    @Override
    public Customer editCustomer(Long id) {
        return null;
    }

    @Override
    public Customer deleteCustomer(Long id) {
        return null;
    }

}
