package com.global.inbox.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "items")
public class Item {
    @Id
    UUID id;
    @NotNull
    String username;
    String description;
    LocalDateTime created;
    LocalDateTime updated;
    @Enumerated(EnumType.STRING)
    ItemStatus status;
}
