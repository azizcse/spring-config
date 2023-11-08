package com.ext.logg.dev.api;

public class ApiException extends StatusCodeException{
    private static final long serialVersionUID = 1L;

    // TODO: try to clean up some of these c-tor's probably don't need all of them
    /**
     * Default invalid external response exception.
     *
     * @param message
     */
    public ApiException(String message) {
        super(ApiResponse.GENERIC_NON_RETRIABLE_ERROR, message); // by default no retries
    }

    /**
     * Default invalid external response exception.
     *
     * @param
     */
    public ApiException(Exception ex) {
        this(ex, ApiResponse.GENERIC_NON_RETRIABLE_ERROR); // by default no retries
    }

    /**
     * Handy constructor for setting the http status code response.
     *
     * @param message
     * @param statusCode
     */
    public ApiException(String message, int statusCode) {
        super(statusCode, message);
    }

    /**
     * Default invalid external response exception.
     *
     * @param
     */
    public ApiException(Exception ex, int statusCode) {
        this(ex.getMessage(), statusCode);
    }

    /**
     * Default unexpected exception.
     *
     * @param message
     * @param cause
     */
    public ApiException(String message, Throwable cause) {
        this(message, cause, ApiResponse.GENERIC_RETRIABLE_ERROR); // can retry
    }

    /**
     * Message from cause is not included in message if we provide our own
     * message.
     *
     * @param message
     * @param cause
     * @param statusCode
     */
    public ApiException(String message, Throwable cause, int statusCode) {
        super(statusCode, message + " -> " + cause.toString());
    }
}
