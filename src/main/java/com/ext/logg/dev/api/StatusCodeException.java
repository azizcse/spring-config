package com.ext.logg.dev.api;

import lombok.Getter;

public class StatusCodeException extends RuntimeException{
    @Getter
    private final int statusCode;

    public StatusCodeException(int returnCode, String message) {
        super(message);
        this.statusCode = returnCode;
    }
}
