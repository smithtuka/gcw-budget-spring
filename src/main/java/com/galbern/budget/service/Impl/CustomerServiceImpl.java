package com.galbern.budget.service.Impl;

import com.galbern.budget.dao.CustomerDao;
import com.galbern.budget.domain.Customer;
import com.galbern.budget.service.CustomerService;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    @Override
    public Customer addCustomer(Customer c){
      return customerDao.save(c);
    }

    @Override
    public List<Customer> fundCustomers() {
        return null;
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
