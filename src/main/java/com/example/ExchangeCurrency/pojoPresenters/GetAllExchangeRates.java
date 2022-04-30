package com.example.ExchangeCurrency.pojoPresenters;

import com.google.gson.JsonObject;

public class GetAllExchangeRates {
    private String rates;
    private String base;


    public GetAllExchangeRates(JsonObject jsonObject) {

        rates = jsonObject.get("rates").getAsString();
        base = jsonObject.get("base").getAsString();
    }

    @Override
    public String toString() {
        return "{" +
                "Rates of: " + base + ","+
                "result:" + rates +
                '}';
    }
}


