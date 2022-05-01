package com.example.ExchangeCurrency.pojoPresenters;

import com.google.gson.JsonObject;

public class ConvertAmountMultipleCurrencies {


    private String base;
    private String rates;
    private String[] str;
    private String allRates = "";



    public ConvertAmountMultipleCurrencies(JsonObject jsonObject) {
        base = jsonObject.get("base").getAsString();
        rates = jsonObject.get("rates").toString();
        str = rates.split(",");

    }

    public String getAllRates(){
        for (int i=0; i<str.length;i++){
            allRates += str[i]+ "\n";
        }
        return allRates;
    }

    @Override
    public String toString() {
        return
                "From: " + base + ", "+

                "Exchange value to selected currencies: " + getAllRates() +
                "";
    }
}
