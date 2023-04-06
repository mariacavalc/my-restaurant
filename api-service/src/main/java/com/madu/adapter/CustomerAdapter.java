package com.madu.adapter;

import com.madu.dto.Customer;
import com.madu.mapper.CustomerMapper;
import com.madu.service.CustomerService;
import org.openapitools.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerAdapter {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CustomerService customerService;

    public Cliente addCustomer(Cliente cliente) {
        Customer customer = customerMapper.toDTO(cliente);
        return customerMapper.fromDTO(customerService.addCustomer(customer));
    }
}
