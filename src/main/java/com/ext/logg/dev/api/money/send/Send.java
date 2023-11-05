package com.ext.logg.dev.api.money.send;

import com.ext.logg.dev.api.money.Money;

public interface Send extends Money {
    String SEND = "send";
    SendResponse send(SendRequest req);
}
