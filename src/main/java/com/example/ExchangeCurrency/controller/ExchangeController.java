package com.example.ExchangeCurrency.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

    private static String URL = "https://api.exchangerate.host/";

    @GetMapping("/")
    public String cenas(){
        return (URL);
    }
}
