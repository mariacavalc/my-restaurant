package com.madu.mapper;

import com.madu.dto.ItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.Item;
import org.openapitools.model.ItemInfo;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mapping(source = "nome", target = "name")
    @Mapping(source = "descricao", target = "description")
    @Mapping(source = "ingredientes", target = "ingredients")
    ItemDTO toDTO(Item item);

    @Mapping(target = "nome", source = "name")
    @Mapping(target = "descricao", source = "description")
    @Mapping(target = "ingredientes", source = "ingredients")
    ItemInfo fromDTO(ItemDTO itemDTO);
}
