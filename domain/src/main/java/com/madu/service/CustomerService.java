package com.madu.service;

import com.madu.dto.Customer;
import com.madu.port.CustomerDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDatabase customerDatabase;

    public Customer addCustomer(Customer customer) {
        //TODO: Email, cpf, date of brith and phone validation
        return customerDatabase.addCustomer(customer);
    }
}
