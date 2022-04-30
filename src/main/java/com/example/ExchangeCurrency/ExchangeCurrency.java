package com.example.ExchangeCurrency;

public class ExchangeCurrency {

    private String result;
    private String base;
    private String rates;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "ExchangeCurrency{" +
                "result='" + result + '\'' +
                ", base='" + base + '\'' +
                ", rates='" + rates + '\'' +
                '}';
    }
}
