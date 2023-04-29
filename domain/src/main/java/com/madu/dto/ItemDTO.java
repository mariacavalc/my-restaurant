package com.madu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ItemDTO {

    private Long id;

    private String name;

    private String description;

    private String ingredients;
}
