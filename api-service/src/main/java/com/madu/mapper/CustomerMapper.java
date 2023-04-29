package com.madu.mapper;

import com.madu.dto.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.Cliente;
import org.openapitools.model.ClienteInfo;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "nome", target = "name")
    @Mapping(source = "endereco", target = "address")
    @Mapping(source = "dataNascimento", target = "dateOfBirth")
    @Mapping(source = "telefone", target = "phone")
    CustomerDTO toDTO(Cliente cliente);

    @Mapping(target = "nome", source = "name")
    @Mapping(target = "endereco", source = "address")
    @Mapping(target = "dataNascimento", source = "dateOfBirth")
    @Mapping(target = "telefone", source = "phone")
    ClienteInfo fromDTO(CustomerDTO customer);
}
