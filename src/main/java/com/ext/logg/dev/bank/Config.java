package com.ext.logg.dev.bank;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Slf4j
@Data
@ConfigurationProperties("ext.ebl")
@Component("Config-ebl")
public class Config {
    private String sendMoneyApi;

    public String getSendMoneyApi() {
        return sendMoneyApi;
    }

    public void setSendMoneyApi(String sendMoneyApi) {
        this.sendMoneyApi = sendMoneyApi;
    }
}
