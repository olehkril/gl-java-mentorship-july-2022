package com.global.inbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    @Id
    UUID id;
    @NotNull
    String name;
    String description;
    LocalDateTime created;
    LocalDateTime updated;
    ItemStatus status;
}
