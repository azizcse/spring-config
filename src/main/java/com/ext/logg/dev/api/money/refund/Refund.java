package com.ext.logg.dev.api.money.refund;

import com.ext.logg.dev.api.money.Money;

public interface Refund extends Money {
    String REFUND = "refund";

    RefundResponse refund(RefundRequest req);
}
