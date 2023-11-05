package com.ext.logg.dev.api;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public abstract class ApiResponse {
    public static final int CREATED = 201;
    public static final int PROCESSING = 202;

    public static final int BAD_REQUEST = 400;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;
    public static final int CONFLICT = 409;
    private Map<String, Object> extDetails;

    public void addExtDetails(String name, Object value) {
        if (this.extDetails == null) {
            this.extDetails = new HashMap<>();
        }
        this.extDetails.put(name, value);
    }
}
