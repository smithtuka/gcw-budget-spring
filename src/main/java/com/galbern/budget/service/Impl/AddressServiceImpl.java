package com.galbern.budget.service.Impl;

import com.galbern.budget.dao.AddressDao;
import com.galbern.budget.domain.Address;
import com.galbern.budget.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired //(required = true) // see why it contradicts wen set to true
    public AddressDao addressDao;


    @Override
    public Address addAddress(Address a) {
       // Address b = addressDao.save( a);
        return addressDao.save( a);
    }

    @Override
    public Set<Address> getAddresses() {
        // test injection
        Address a = new Address("w","ww","d","i");
        a.setId(3);

        Set<Address> set = new HashSet<Address>(addressDao.findAll());
        set.add(a);
//        set.addAll((Set<Address>)addressDao.findAll());
//        for(Address a : addressDao.findAll() )set.add(a);
        return set;
    }


}
