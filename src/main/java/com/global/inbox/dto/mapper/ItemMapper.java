package com.global.inbox.dto.mapper;

import com.global.inbox.dto.ItemDto;
import com.global.inbox.model.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDto dtoToItem(Item item);

    List<ItemDto> getListDto(List<Item> items);

}
