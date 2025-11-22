package com.drlng.app.model.user.dto;

import lombok.Builder;
import lombok.Getter;
import com.drlng.app.model.user.UserType;

@Builder(toBuilder = true)
@Getter
public class UserUpdateDto {

    private String email;
    private String phoneNumber;
    private UserType userType;

}
