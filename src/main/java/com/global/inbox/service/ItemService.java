package com.global.inbox.service;

import com.global.inbox.dto.ItemDto;
import com.global.inbox.model.Item;

import java.util.List;

public interface ItemService {

    Item save(ItemDto itemDto);

    List<Item> getAll();
}
