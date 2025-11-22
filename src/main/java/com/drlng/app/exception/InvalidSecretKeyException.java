package com.drlng.app.exception;

public class InvalidSecretKeyException extends RuntimeException {

    public InvalidSecretKeyException() {
        super("Invalid or expired secret key");
    }
}