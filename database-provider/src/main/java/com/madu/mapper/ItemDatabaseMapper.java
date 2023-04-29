package com.madu.mapper;

import com.madu.dto.ItemDTO;
import com.madu.entity.ItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemDatabaseMapper {

    ItemDTO toDTO(ItemEntity itemEntity);

    ItemEntity fromDTO(ItemDTO itemDTO);
}
