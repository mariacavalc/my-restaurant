package com.madu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
public class ItemDTO {

    private Long id;

    private String name;

    private String description;

    private String type;

    private BigDecimal price;
}
