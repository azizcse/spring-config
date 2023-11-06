package com.ext.logg.dev.bank.ebl;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties("bank.ebl")
@Component("Config-ebl")
public class Config {
    private String serviceUrl;
}
