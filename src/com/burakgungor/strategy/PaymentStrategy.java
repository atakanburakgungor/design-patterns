package com.burakgungor.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    boolean pay(BigDecimal paymentAmount);
}
