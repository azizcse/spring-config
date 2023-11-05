package com.ext.logg.dev;


import com.ext.logg.dev.bank.scb.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private Config config1;
    @Autowired
    private Config config2;

    @GetMapping("msg")
    public String sayHello() {
        logger.error("Write gretting message write");
        logger.info("Ext path 1 : " + config1.getSendMoneyApi());
        logger.info("Ext path 2 : " + config2.getSendMoneyApi());
        long time = System.currentTimeMillis();
        printException();
        return "Hello " + time;
    }

    private void printException() {
        //int value =  10;
        //int div = value/0;

    }
}
