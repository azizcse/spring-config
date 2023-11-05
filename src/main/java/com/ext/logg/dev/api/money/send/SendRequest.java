package com.ext.logg.dev.api.money.send;

import com.ext.logg.dev.api.ApiRequest;
import com.ext.logg.dev.api.money.Money;

public class SendRequest extends ApiRequest {
    protected SendRequest() {
        super(Money.SERVICE, Send.SEND);
    }
}
