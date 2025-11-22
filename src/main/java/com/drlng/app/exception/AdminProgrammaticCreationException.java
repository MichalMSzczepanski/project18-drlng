package com.drlng.app.exception;

public class AdminProgrammaticCreationException extends RuntimeException {

    public AdminProgrammaticCreationException() {
        super("Admins cannot be created programmatically");
    }
}