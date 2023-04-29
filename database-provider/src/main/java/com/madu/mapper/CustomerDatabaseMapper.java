package com.madu.mapper;

import com.madu.dto.CustomerDTO;
import com.madu.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerDatabaseMapper {

    CustomerDTO toDTO(CustomerEntity customerEntity);

    CustomerEntity fromDTO(CustomerDTO customer);
}
