package com.madu.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private Long id;

    private String name;

    private String cpf;

    private String email;

    private String address;

    private String dateOfBirth;

    private String phone;
}
