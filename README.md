# exchangecurrency
Building an application using Java and SpringBoot to fetch data from external API

1 - To run de application open de Pom.xml file with your IDE and and run the ExchangeCurrencyApplication class;
2 - Open your brower on:
localhost:8080/api/{currency} to get all exchange rates for that currency;
localhost:8080/api/{currencyA}/{currencyB} to get the exchange rate from Currency A to Currency B;
localhost:8080/api/{currencyA}/{currencyB}/{amount} to get the conversion of the amount from Currency A to Currency B;
localhost:8080/api/{currencyA}/&/{amount}/{currencyA,currencyB(...)} to get the exchange rate of a specific amount to specific currencies.
