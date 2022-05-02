package com.example.ExchangeCurrency.pojoPresenters;

import com.google.gson.JsonObject;

public class ConvertAmountMultipleCurrencies {


    private String base;
    private String rates;



    public ConvertAmountMultipleCurrencies(JsonObject jsonObject) {
        base = jsonObject.get("base").getAsString();
        rates = jsonObject.get("rates").toString();

    }



    @Override
    public String toString() {
        return "{"+
                "From: " + base + ", "+
                "Exchange value to selected currencies: " + rates +
                "}";
    }
}
