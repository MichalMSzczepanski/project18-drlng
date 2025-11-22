package com.drlng.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.drlng.app.model.LoginResponse;
import com.drlng.app.model.user.dto.UserCommsDto;
import com.drlng.app.model.user.dto.UserCreateDto;
import com.drlng.app.model.user.dto.UserDto;
import com.drlng.app.model.user.dto.UserLoginDto;
import com.drlng.app.service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/v1/internal/user")
@RequiredArgsConstructor
public class InternalUserController {

    private final UserService userService;

    @PostMapping("/authenticate")
    public Optional<LoginResponse> authenticate(@RequestBody UserLoginDto dto) {
        return userService.authenticate(dto);
    }

    @PostMapping("")
    public UserDto create(@RequestBody UserCreateDto userDto) {
        return userService.createUser(userDto);
    }

    @GetMapping("/all-users")
    public List<UserDto> getAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/comms/{userId}")
    public UserCommsDto getComms(@PathVariable UUID userId) {
        return userService.getUserComms(userId);
    }

}
