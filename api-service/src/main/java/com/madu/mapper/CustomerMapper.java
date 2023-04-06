package com.madu.mapper;

import com.madu.dto.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.Cliente;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "nome", target = "name")
    @Mapping(source = "endereco", target = "address")
    @Mapping(source = "dataNascimento", target = "dateOfBirth")
    @Mapping(source = "telefone", target = "phone")
    Customer toDTO(Cliente cliente);

    @Mapping(target = "nome", source = "name")
    @Mapping(target = "endereco", source = "address")
    @Mapping(target = "dataNascimento", source = "dateOfBirth")
    @Mapping(target = "telefone", source = "phone")
    Cliente fromDTO(Customer customer);
}
