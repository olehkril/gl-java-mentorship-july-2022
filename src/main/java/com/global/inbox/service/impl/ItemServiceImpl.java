package com.global.inbox.service.impl;

import com.global.inbox.dto.CreateItemDto;
import com.global.inbox.dto.ItemDto;
import com.global.inbox.dto.mapper.ItemMapper;
import com.global.inbox.model.Item;
import com.global.inbox.model.ItemStatus;
import com.global.inbox.repository.ItemRepository;
import com.global.inbox.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Override
    public Mono<ItemDto> save(CreateItemDto itemDto) {
        final Item item = new Item(UUID.randomUUID(), itemDto.getName(), itemDto.getDescription(),
                LocalDateTime.now(), LocalDateTime.now(), ItemStatus.ACTIVE,true);

        return itemMapper.fromMono(itemRepository.save(item));
    }

    @Override
    public Flux<ItemDto> getAll() {
        return itemMapper.fromFlux(itemRepository.findAll());
    }

    @Override
    public Mono<ItemDto> update(CreateItemDto itemDto) {
        return null;
    }

    @Override
    public Mono<Void> delete(UUID itemID) {
        return itemRepository.deleteById(itemID);
    }
}
