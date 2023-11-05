package com.ext.logg.dev.bank.scb;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties("bank.scb")
@Component("Config-scb")
public class Config {
    private String sendMoneyApi;

    public String getSendMoneyApi() {
        return sendMoneyApi;
    }

    public void setSendMoneyApi(String sendMoneyApi) {
        this.sendMoneyApi = sendMoneyApi;
    }
}
