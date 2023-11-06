package com.ext.logg.dev.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApiDispatcher<T> {
    @Autowired
    private ApplicationContext context;

    public T getBeanService(){
        context.getBean("");
        return null;
    }
}
