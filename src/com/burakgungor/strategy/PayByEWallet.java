package com.burakgungor.strategy;

import java.math.BigDecimal;

public class PayByEWallet implements PaymentStrategy{
    private String email;
    private String password;

    public PayByEWallet(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pay(BigDecimal paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using wallet.");
        return true;
    }
}
