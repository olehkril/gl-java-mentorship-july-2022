package com.global.inbox.service.impl;

import com.global.inbox.dto.CreateItemDto;
import com.global.inbox.dto.ItemDto;
import com.global.inbox.dto.converter.ItemConverter;
import com.global.inbox.model.Item;
import com.global.inbox.model.ItemStatus;
import com.global.inbox.repository.ItemRepository;
import com.global.inbox.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ItemServiceStub implements ItemService {

    private ItemRepository itemRepository;
    private ItemConverter itemConverter;

    @Override
    public ItemDto save(CreateItemDto itemDto) {
        final Item item = new Item(UUID.randomUUID(), itemDto.getUsername(), itemDto.getDescription(),
                LocalDateTime.now(), LocalDateTime.now(), ItemStatus.ACTIVE);
        itemRepository.save(item);
        return itemConverter.toDto(item);
    }

    @Override
    public List<Item> getAll() {
        return List.of(Item.builder().id(UUID.randomUUID()).username("FifthElement").build(), Item.builder().id(UUID.randomUUID()).username("Luc Besson").build());
    }
}
