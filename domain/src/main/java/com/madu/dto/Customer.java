package com.madu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Builder
public class Customer {

    private Long id;

    private String name;

    private String cpf;

    private String email;

    private String address;

    private LocalDate dateOfBirth;

    private String phone;
}
