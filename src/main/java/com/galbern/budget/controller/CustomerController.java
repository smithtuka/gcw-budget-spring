package com.galbern.budget.controller;

import com.galbern.budget.domain.Customer;
import com.galbern.budget.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public String addCustomer(@RequestBody Customer customer){
        Customer c = customerService.addCustomer(customer);
        return  " successfully added"; //c.getfName()+
    }
    @GetMapping
    public Set<Customer> getCustomers(){
        return (Set<Customer>)customerService.getCustomers();

    }
}
