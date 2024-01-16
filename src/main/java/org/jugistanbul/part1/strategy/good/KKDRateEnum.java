package org.jugistanbul.part1.strategy.good;

import java.math.BigDecimal;

public enum KKDRateEnum {

    DEFAULT_KKD(new BigDecimal(0.10)),
    LOW_KKD(new BigDecimal(0.0009)),
    HIGH_KKD(new BigDecimal(1.890));


    final BigDecimal KKDValue;

    KKDRateEnum(BigDecimal size) {
        this.KKDValue = size;
    }

    public BigDecimal getKKDValue() {
        return KKDValue;
    }
}
