package com.drlng.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.drlng.app.model.user.dto.UserDto;
import com.drlng.app.model.user.dto.UserUpdateDto;
import com.drlng.app.model.user.dto.UserUpdatePasswordDto;
import com.drlng.app.service.UserService;

import java.util.UUID;

@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
public class AuthenticatedUserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public UserDto get(@PathVariable UUID userId) {
        return userService.getUser(userId);
    }

    @PatchMapping("/update/{userId}")
    public UserDto update(@PathVariable UUID userId, @RequestBody UserUpdateDto dto) {
        return userService.updateUser(userId, dto);
    }

    @PatchMapping("/update-password/{userId}")
    public ResponseEntity<String> updatePassword(@PathVariable UUID userId,
                                                 @RequestBody UserUpdatePasswordDto dto) {
        userService.updatePassword(userId, dto);
        return ResponseEntity.ok("Successfully updated password");
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> delete(@PathVariable UUID userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("Successfully deleted user");
    }
}
