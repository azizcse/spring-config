package com.ext.logg.dev.bank.ucb;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties("bank.ucb")
@Component("Config-ucb")
public class Config {
    private String serviceUrl;
}
