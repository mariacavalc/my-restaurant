package com.madu.service;

import com.madu.dto.ItemDTO;
import com.madu.port.ItemDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemDatabase itemDatabase;

    public ItemDTO addItem(ItemDTO itemDTO) {
        return itemDatabase.addItem(itemDTO);
    }
}
