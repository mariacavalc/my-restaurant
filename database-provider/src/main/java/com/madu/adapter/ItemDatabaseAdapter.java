package com.madu.adapter;

import com.madu.dto.ItemDTO;
import com.madu.entity.ItemEntity;
import com.madu.mapper.ItemDatabaseMapper;
import com.madu.port.ItemDatabase;
import com.madu.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ItemDatabaseAdapter implements ItemDatabase {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ItemDatabaseMapper itemMapper;

    @Override
    public ItemDTO addItem(ItemDTO item) {
        ItemEntity entity = itemMapper.fromDTO(item);
        return itemMapper.toDTO(itemRepository.saveAndFlush(entity));
    }

    @Override
    public Optional<ItemDTO> findByName(String name) {
        Optional<ItemEntity> optionalItem = itemRepository.findByName(name);
        return optionalItem.map(itemMapper::toDTO);
    }
}
