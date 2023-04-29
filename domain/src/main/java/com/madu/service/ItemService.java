package com.madu.service;

import com.madu.dto.ItemDTO;
import com.madu.exception.BadRequestException;
import com.madu.port.ItemDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemDatabase itemDatabase;

    public ItemDTO addItem(ItemDTO itemDTO) {
        Optional<ItemDTO> itemByName = itemDatabase.findByName(itemDTO.getName());
        if (itemByName.isPresent()) {
            throw new BadRequestException("Existe um item cadastrado com esse nome, insira um nome válido");
        }

        return itemDatabase.addItem(itemDTO);
    }
}
