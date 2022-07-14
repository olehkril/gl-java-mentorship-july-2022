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
@Table(name = "users")
public class User {
    @Id
    UUID id;
    @NotNull
    String name;
    @NotNull
    String email;
    LocalDateTime created;
    LocalDateTime updated;
    @Enumerated(EnumType.STRING)
    UserStatus status;
}
