package com.global.inbox.dto;

import com.global.inbox.model.ItemStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateItemDto {
    UUID id;
    @NotNull
    String name;
    String description;
    ItemStatus status;
}
