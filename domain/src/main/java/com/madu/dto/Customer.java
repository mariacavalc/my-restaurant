package com.madu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
