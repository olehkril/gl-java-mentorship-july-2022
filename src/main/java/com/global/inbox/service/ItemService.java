package com.global.inbox.service;

import com.global.inbox.dto.CreateItemDto;
import com.global.inbox.dto.ItemDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface ItemService {

    Mono<ItemDto> save(CreateItemDto itemDto);

    Flux<ItemDto> getAll();

    Mono<ItemDto> update(CreateItemDto itemDto);

    Mono<Void> delete(UUID itemID);
}
