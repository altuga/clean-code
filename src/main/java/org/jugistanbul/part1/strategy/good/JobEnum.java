package org.jugistanbul.part1.strategy.good;

public enum JobEnum {

    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8),
    NONET(9), DECTET(10), TRIPLE_QUARTET(12);

    final int numberOf;

    JobEnum(int size) {
        this.numberOf = size;
    }


}
