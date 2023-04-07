package com.madu.adapter;

import com.madu.dto.Customer;
import com.madu.entity.CustomerEntity;
import com.madu.mapper.CustomerDatabaseMapper;
import com.madu.port.CustomerDatabase;
import com.madu.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDatabaseAdapter implements CustomerDatabase {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerDatabaseMapper customerMapper;

    @Override
    public Customer addCustomer(Customer customer) {
        CustomerEntity entity = customerMapper.fromDTO(customer);
        return customerMapper.toDTO(customerRepository.saveAndFlush(entity));
    }
}
