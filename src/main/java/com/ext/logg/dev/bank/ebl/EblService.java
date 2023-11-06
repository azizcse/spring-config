package com.ext.logg.dev.bank.ebl;

import com.ext.logg.dev.api.money.refund.Refund;
import com.ext.logg.dev.api.money.refund.RefundRequest;
import com.ext.logg.dev.api.money.refund.RefundResponse;
import com.ext.logg.dev.api.money.send.Send;
import com.ext.logg.dev.api.money.send.SendRequest;
import com.ext.logg.dev.api.money.send.SendResponse;
import org.springframework.stereotype.Service;

@Service(value = "Money-ebl")
public class EblService implements Send, Refund {

    @Override
    public SendResponse send(SendRequest req) {
        return null;
    }

    @Override
    public RefundResponse refund(RefundRequest req) {
        return null;
    }
}
