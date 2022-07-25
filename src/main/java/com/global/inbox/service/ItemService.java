package com.global.inbox.service;

import com.global.inbox.dto.CreateItemDto;
import com.global.inbox.dto.ItemDto;
import com.global.inbox.model.Item;

import java.util.List;

public interface ItemService {

    ItemDto save(CreateItemDto itemDto);

    List<ItemDto> getAll();
}
