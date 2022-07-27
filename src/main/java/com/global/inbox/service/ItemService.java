package com.global.inbox.service;

import com.global.inbox.dto.CreateItemDto;
import com.global.inbox.dto.ItemDto;
import com.global.inbox.model.Item;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ItemService {

    Mono<ItemDto> save(CreateItemDto itemDto);

    Flux<ItemDto> getAll();
}
