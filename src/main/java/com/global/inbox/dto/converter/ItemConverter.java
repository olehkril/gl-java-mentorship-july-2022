package com.global.inbox.dto.converter;

import com.global.inbox.dto.ItemDto;
import com.global.inbox.model.Item;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ItemConverter {
    public ItemDto toDto(Item item){
        return new ItemDto(item.getId(),item.getUsername(),item.getDescription(), LocalDateTime.now(),LocalDateTime.now(),item.getStatus());
    }
}
