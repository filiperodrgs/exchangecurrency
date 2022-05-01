package com.example.ExchangeCurrency.pojoPresenters;

import com.google.gson.JsonObject;

public class GetAllExchangeRates {
    private String rates;
    private String base;

    private String[] str;
    private String allRates = "";

    public GetAllExchangeRates(JsonObject jsonObject) {

        rates = jsonObject.get("rates").toString();
        str = rates.split(",");


        base = jsonObject.get("base").getAsString();

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
                "Exchange rates for all currencies: "  + getAllRates() +"\n"+
                "";
    }
}


