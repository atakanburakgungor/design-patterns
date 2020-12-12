package com.burakgungor.behavioral.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    boolean pay(BigDecimal paymentAmount);
}
