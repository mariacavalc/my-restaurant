package com.madu.adapter;

import com.madu.dto.ItemDTO;
import com.madu.mapper.ItemMapper;
import com.madu.service.ItemService;
import org.openapitools.model.Item;
import org.openapitools.model.ItemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemAdapter {

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemService itemService;

    public ItemInfo addItem(Item item) {
        ItemDTO itemDTO = itemMapper.toDTO(item);
        return itemMapper.fromDTO(itemService.addItem(itemDTO));
    }
}
