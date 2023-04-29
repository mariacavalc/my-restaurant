package com.madu.service;

import com.madu.dto.Customer;
import com.madu.port.CustomerDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDatabase customerDatabase;

    @Autowired
    private ValidatorService validatorService;

    public Customer addCustomer(Customer customer) {
        isValidCustomer(customer);
        return customerDatabase.addCustomer(customer);
    }

    private void isValidCustomer(Customer customer) {
        validatorService.isCPFValid(customer.getCpf());
        validatorService.isPhoneValid(customer.getPhone());
        validatorService.isEmailValid(customer.getEmail());
    }
}
