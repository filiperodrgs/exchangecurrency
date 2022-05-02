package com.example.ExchangeCurrency.pojoPresenters;

import com.google.gson.JsonObject;

public class GetAllExchangeRates {
    private String rates;
    private String base;

    public GetAllExchangeRates(JsonObject jsonObject) {

        rates = jsonObject.get("rates").toString();



        base = jsonObject.get("base").getAsString();

    }



    @Override
    public String toString() {
        return "{"+
                "From: " + base + " , "+
                "Exchange rates for all currencies: "  + rates +
                "}";
    }
}


