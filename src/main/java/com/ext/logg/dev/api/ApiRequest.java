package com.ext.logg.dev.api;

import java.util.Map;
import java.util.TreeMap;

public abstract class ApiRequest {

    private String ext;

    private String service;

    private String action;
    private Map<String, String> params;

    protected ApiRequest(String service, String action) {
        this.service = service;
        this.action = action;
        this.params = new TreeMap<>(); // it's just easier if we always have optionals
    }
}
