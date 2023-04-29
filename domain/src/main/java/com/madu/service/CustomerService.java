package com.madu.service;

import com.madu.dto.CustomerDTO;
import com.madu.port.CustomerDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDatabase customerDatabase;

    @Autowired
    private ValidatorService validatorService;

    public CustomerDTO addCustomer(CustomerDTO customer) {
        isValidCustomer(customer);
        return customerDatabase.addCustomer(customer);
    }

    private void isValidCustomer(CustomerDTO customer) {
        validatorService.isCPFValid(customer.getCpf());
        validatorService.isPhoneValid(customer.getPhone());
        validatorService.isEmailValid(customer.getEmail());
    }
}
