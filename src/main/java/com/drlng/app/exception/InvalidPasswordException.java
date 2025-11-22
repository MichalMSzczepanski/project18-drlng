package com.drlng.app.exception;

public class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException() {
        super("Provided password is invalid");
    }
}