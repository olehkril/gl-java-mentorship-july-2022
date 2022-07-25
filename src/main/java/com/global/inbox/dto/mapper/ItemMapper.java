package com.global.inbox.dto.mapper;

import com.global.inbox.dto.ItemDto;
import com.global.inbox.model.Item;
import org.mapstruct.Mapper;
import reactor.core.publisher.Flux;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDto dtoToItem(Item item);

    default Flux<ItemDto> getListDto(Flux<Item> items) {
        return items.map(this::dtoToItem);
    }

}
