package com.global.inbox.dto;

import com.global.inbox.model.ItemStatus;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    UUID id;
    @NotNull
    String username;
    String description;
    LocalDateTime created;
    LocalDateTime updated;
    @Enumerated(EnumType.STRING)
    ItemStatus status;
}
