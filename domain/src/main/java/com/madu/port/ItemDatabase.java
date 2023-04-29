package com.madu.port;

import com.madu.dto.ItemDTO;

import java.util.Optional;

public interface ItemDatabase {

    ItemDTO addItem(ItemDTO item);

    Optional<ItemDTO> findByName(String name);
}
