package com.ext.logg.dev.api.money.refund;

import com.ext.logg.dev.api.ApiRequest;
import com.ext.logg.dev.api.money.Money;

public class RefundRequest extends ApiRequest {
    protected RefundRequest() {
        super(Money.SERVICE, Refund.REFUND);
    }
}
