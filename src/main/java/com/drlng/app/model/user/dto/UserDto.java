package com.drlng.app.model.user.dto;

import lombok.Builder;
import lombok.Getter;
import com.drlng.app.model.user.UserType;

import java.util.UUID;

@Builder(toBuilder = true)
@Getter
public class UserDto {

    private UUID id;
    private String email;
    private UserType userType;
    private boolean active;
    private String phoneNumber;
    private UUID secretKey;

}
