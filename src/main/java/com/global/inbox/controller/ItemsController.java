package com.global.inbox.controller;

import com.global.inbox.dto.CreateItemDto;
import com.global.inbox.dto.ItemDto;
import com.global.inbox.model.Item;
import com.global.inbox.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {

    private final ItemService itemService;

    public ItemsController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<ItemDto> getAll() {
        return itemService.getAll();
    }

    @PostMapping
    public ItemDto create(@RequestBody CreateItemDto itemDto) {
        return itemService.save(itemDto);
    }
}
