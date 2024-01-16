package org.jugistanbul.part1.strategy.good;

public enum SectorCodeEnum {

    HIGH_RISK(1), LOW_RISK(2), NORMAL_RISK(3), NO_RISK(4), SHARED_RISK(5);

    final int numberOf;

    SectorCodeEnum(int size) {
        this.numberOf = size;
    }
}
