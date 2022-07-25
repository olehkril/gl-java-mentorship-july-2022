package com.global.inbox.controller;

import com.global.inbox.dto.CreateItemDto;
import com.global.inbox.dto.ItemDto;
import com.global.inbox.service.ItemService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/items")
public class ItemsController {

    private final ItemService itemService;

    public ItemsController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public Flux<ItemDto> getAll() {
        return itemService.getAll();
    }

    @PostMapping
    public Mono<ItemDto> create(@RequestBody CreateItemDto itemDto) {
        return itemService.save(itemDto);
    }
}
