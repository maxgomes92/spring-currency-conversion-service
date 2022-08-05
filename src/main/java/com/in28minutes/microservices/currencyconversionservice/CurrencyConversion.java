package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

//{
//"id": 10001,
//"from": "USD",
//"to": "INR",
//"conversionMultiple": 65.00,
//"quantity": 10,
//"totalCalculatedAmount": 650.00,
//"environment": "8000 instance-id"
//}

public class CurrencyConversion {
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculatedAmount;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(String from, String to, BigDecimal quantity, BigDecimal conversionMultiple, BigDecimal totalCalculatedAmount, String environment) {
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
