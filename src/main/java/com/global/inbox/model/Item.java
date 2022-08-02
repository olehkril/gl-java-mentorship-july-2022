package com.global.inbox.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "items")
public class Item implements Persistable<UUID> {
    @Id
    UUID id;
    @NotNull
    String name;
    String description;
    LocalDateTime created;
    LocalDateTime updated;
    ItemStatus status;

    @Transient
    @JsonIgnore
    public boolean newItem;

    @Transient
    @Override
    public boolean isNew() {
        return this.newItem || id == null;
    }

    public Item setAsNew(){
        this.newItem =true;
        return this;
    }
}
