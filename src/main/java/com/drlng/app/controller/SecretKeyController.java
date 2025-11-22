package com.drlng.app.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.drlng.app.model.key.KeyType;
import com.drlng.app.model.key.SecretKey;
import com.drlng.app.service.SecretKeyService;

import java.util.UUID;

@RestController
@RequestMapping("/v1/secret-key")
@RequiredArgsConstructor
public class SecretKeyController {

    private final SecretKeyService secretKeyService;

    @GetMapping("/{userId}/{keyType}")
    SecretKey getByUserIdAndKeyType(@PathVariable("userId") UUID userId, @PathVariable("keyType") KeyType keyType) {
        return secretKeyService.getByUserIdAndKeyType(userId, keyType);
    }

}
