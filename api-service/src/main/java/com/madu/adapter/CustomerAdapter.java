package com.madu.adapter;

import com.madu.dto.CustomerDTO;
import com.madu.mapper.CustomerMapper;
import com.madu.service.CustomerService;
import org.openapitools.model.Cliente;
import org.openapitools.model.ClienteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerAdapter {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CustomerService customerService;

    public ClienteInfo addCustomer(Cliente cliente) {
        CustomerDTO customerDTO = customerMapper.toDTO(cliente);
        return customerMapper.fromDTO(customerService.addCustomer(customerDTO));
    }
}
