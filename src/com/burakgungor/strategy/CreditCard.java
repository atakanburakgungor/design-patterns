package com.burakgungor.strategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Dummy credit card class.
 */
public class CreditCard {
    private BigDecimal amount;
    private String number;
    private LocalDateTime dateTime;
    private String cvv;

    public CreditCard(BigDecimal amount, String number, LocalDateTime dateTime, String cvv) {
        this.amount = new BigDecimal(Math.random());
        this.number = number;
        this.dateTime = dateTime;
        this.cvv = cvv;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
