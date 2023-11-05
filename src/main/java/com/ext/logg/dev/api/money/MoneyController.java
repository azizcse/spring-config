package com.ext.logg.dev.api.money;

import com.ext.logg.dev.api.ApiResponse;
import com.ext.logg.dev.api.money.send.SendRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyController {
    private final static String URL_PRE = "/api/{bank}/money";
    public ResponseEntity<String> send(@PathVariable String ext, @RequestBody(required = false) SendRequest req){
        return ResponseEntity.ok("Hello :"+ext);
    }
}
