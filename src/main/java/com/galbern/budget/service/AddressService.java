package com.galbern.budget.service;

import com.galbern.budget.domain.Address;
//import org.apache.tomcat.jni.Address;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface AddressService {
    Address addAddress(Address a);
    Set<Address> getAddresses();

}
