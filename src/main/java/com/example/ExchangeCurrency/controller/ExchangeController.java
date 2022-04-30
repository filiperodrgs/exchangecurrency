package com.example.ExchangeCurrency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class ExchangeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/{a}")
    public String getExchangeRates(@PathVariable String a) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("https://api.exchangerate.host/latest?base="+a, HttpMethod.GET, entity, String.class).getBody();
    }

    @GetMapping(value = "/{a}/{b}")
    public String getConversion(@PathVariable String a, @PathVariable String b) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("https://api.exchangerate.host/convert?from="+a+"&to="+b, HttpMethod.GET, entity, String.class).getBody();
    }

    @GetMapping(value = "/{a}/{b}/{amount}")
    public String getSpecificAmount(@PathVariable String a, @PathVariable String b,@PathVariable String amount) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("https://api.exchangerate.host/convert?from="+a+"&to="+b+"&amount="+amount, HttpMethod.GET, entity, String.class).getBody();
    }



}
