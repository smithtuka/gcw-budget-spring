package com.galbern.budget.controller;

import com.galbern.budget.domain.Address;
import com.galbern.budget.service.AddressService;
//import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public String addAddress(@RequestBody Address address){
        Address a = addressService.addAddress(address);
        return  a.toString() + "saved ";

    }
    @GetMapping
    public Set<Address> getAddresses(){
        return  addressService.getAddresses();

    }
}
