package com.burakgungor.strategy;


import java.math.BigDecimal;

public class PayByCreditCard implements PaymentStrategy {

    private CreditCard creditCard;

    @Override
    public boolean pay(BigDecimal paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using credit card.");
        creditCard.setAmount(paymentAmount.subtract(creditCard.getAmount()));
        return true;
    }
}
