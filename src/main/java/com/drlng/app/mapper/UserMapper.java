package com.drlng.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import com.drlng.app.model.user.User;
import com.drlng.app.model.user.dto.UserCommsDto;
import com.drlng.app.model.user.dto.UserCreateDto;
import com.drlng.app.model.user.dto.UserDto;
import com.drlng.app.model.user.dto.UserUpdateDto;
import com.drlng.app.service.HashingService;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    @Autowired
    HashingService hashingservice;

    @Mapping(target = "password", source = "password", qualifiedByName = "hashPassword")
    public abstract User toEntity(UserCreateDto userCreateDto);

    public abstract UserDto toUserDto(User user);

    public abstract UserCommsDto toUserCommsDto(User user);

    public abstract UserUpdateDto toUserUpdateDto(User user);

    @Named("hashPassword")
    public String hashPassword(String password) {
        return hashingservice.hashPassword(password);
    }
}
