package com.example.ExchangeCurrency.pojoPresenters;

import com.google.gson.JsonObject;

public class ConvertAmount {
    private String amount;
    private String from;
    private String to;
    private String result;

    public ConvertAmount(JsonObject jsonObject) {

        amount = jsonObject.get("query").getAsJsonObject().get("amount").getAsString();
        from = jsonObject.get("query").getAsJsonObject().get("from").getAsString();
        to = jsonObject.get("query").getAsJsonObject().get("to").getAsString();
        result = jsonObject.get("result").getAsString();

    }

    @Override
    public String toString() {
        return "{" +
                "From: " + from + ", "+
                "To: " + to + ", " +
                "Exchange value of: " + amount + ","+
                "Result:  " + result +
                "}";
    }
}
