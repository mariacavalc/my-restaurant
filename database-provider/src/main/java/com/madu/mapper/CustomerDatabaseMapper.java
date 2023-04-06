package com.madu.mapper;

import com.madu.dto.Customer;
import com.madu.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerDatabaseMapper {

    Customer toDTO(CustomerEntity cliente);

    CustomerEntity fromDTO(Customer customer);
}
