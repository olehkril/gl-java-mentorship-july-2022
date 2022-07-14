package com.global.inbox.dto;

import com.global.inbox.model.UserStatus;
import com.global.inbox.validator.annotation.ValidEmail;
import com.global.inbox.validator.annotation.ValidPassword;
import com.global.inbox.validator.annotation.ValidUserName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotNull
    private UUID id;
    @ValidUserName
    private String username;
    @ValidEmail
    private String email;
    @ValidPassword
    private String password;
    private String vendorId;
    @NotBlank
    private String roleId;
    @NotNull
    private UserStatus status;
}
