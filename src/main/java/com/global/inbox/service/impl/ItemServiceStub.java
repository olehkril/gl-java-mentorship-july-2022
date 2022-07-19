package com.global.inbox.service.impl;

import com.global.inbox.model.Item;
import com.global.inbox.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceStub implements ItemService {

    @Override
    public List<Item> getAll() {
        return List.of(Item.builder().id(UUID.randomUUID()).username("FifthElement").build(),Item.builder().id(UUID.randomUUID()).username("Luc Besson").build());
    }
}
