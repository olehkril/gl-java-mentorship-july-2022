package com.global.inbox.controller;

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
    public List<Item> getAll() {
        return itemService.getAll();
    }

    @PostMapping
    public Item create(@RequestBody ItemDto itemDto) {
        return itemService.save(itemDto);
    }
}
