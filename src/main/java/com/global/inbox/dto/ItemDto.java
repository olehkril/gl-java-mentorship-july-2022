package com.global.inbox.dto;

import com.global.inbox.model.ItemStatus;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    UUID id;
    @NotNull
    String name;
    String description;
    LocalDateTime created;
    LocalDateTime updated;
    ItemStatus status;
}
