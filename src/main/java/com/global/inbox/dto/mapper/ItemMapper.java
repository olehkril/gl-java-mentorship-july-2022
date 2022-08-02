package com.global.inbox.dto.mapper;

import com.global.inbox.dto.ItemDto;
import com.global.inbox.model.Item;
import org.mapstruct.Mapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    default Flux<ItemDto> fromFlux(Flux<Item>itemFlux){
        return itemFlux.map(this::map);
    }

    default Mono<ItemDto> fromMono(Mono<Item> itemMono){
        return itemMono.map(this::map);
    }
    ItemDto map(Item item);
}
