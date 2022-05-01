package com.example.ExchangeCurrency.pojoPresenters;
import com.google.gson.JsonObject;

public class ExchangeCurrencyFromAtoB {

    private String rate;
    private String from;
    private String to;

    public ExchangeCurrencyFromAtoB(JsonObject jsonObject) {

        rate = jsonObject.get("result").getAsString();
        from = jsonObject.get("query").getAsJsonObject().get("from").getAsString();
        to = jsonObject.get("query").getAsJsonObject().get("to").getAsString();

    }

    @Override
    public String toString() {
        return
                "From: " + from + ", "+
                "To: " + to + " > " +
                "Exchange Rate: 1 " + from + " : " +
                rate + " " + to +
                "";
    }
}