package com.example.ExchangeCurrency.controller;

import com.example.ExchangeCurrency.pojoPresenters.ExchangeCurrencyFromAtoB;
import com.example.ExchangeCurrency.pojoPresenters.GetAllExchangeRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Arrays;

@RestController
public class ExchangeController {

    @Autowired
    RestTemplate restTemplate;

    private HttpEntity<String> httpRequest(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return entity;
    }

    private JsonObject gettingJson(String response){
        JsonObject jsonObject = new JsonParser().parse(response).getAsJsonObject();
        return jsonObject;
    }

    private String baseURL = "https://api.exchangerate.host/";

    @GetMapping(value = "/{a}")
    public String getExchangeRates(@PathVariable String a) {
        String response = restTemplate.exchange( baseURL+"latest?base="+ a , HttpMethod.GET, httpRequest(), String.class).getBody();
        JsonObject jsonObject =  gettingJson(response);
        System.out.println(jsonObject);
        return new GetAllExchangeRates(jsonObject).toString();
    }

    @GetMapping(value = "/{a}/&/{amount}")
    public String getAmountInAllCurrencies(@PathVariable String a, @PathVariable String amount) {
        return restTemplate.exchange( baseURL +"latest?base="+ a + "&amount="+amount, HttpMethod.GET, httpRequest(), String.class).getBody();
    }

    @GetMapping(value = "/{a}/{b}")
    public String getConversion(@PathVariable String a, @PathVariable String b) {
        String response = restTemplate.exchange( baseURL+"convert?from="+ a +"&to="+b, HttpMethod.GET, httpRequest(), String.class).getBody();
        JsonObject jsonObject =  gettingJson(response);
        return new ExchangeCurrencyFromAtoB(jsonObject).toString();

    }

    @GetMapping(value = "/{a}/{b}/{amount}")
    public String getSpecificAmount(@PathVariable String a, @PathVariable String b,@PathVariable String amount) {


        return restTemplate.exchange( baseURL+ "convert?from="+a+"&to="+b+"&amount="+amount, HttpMethod.GET, httpRequest(), String.class).getBody();
    }



}
