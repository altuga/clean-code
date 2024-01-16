package org.jugistanbul.part1.strategy.good;

public enum LoanTypeEnum {

    Mortgage(1), Personel(2), Special(3), Vehicle(4);


    final int loadId;

    LoanTypeEnum(int size) {
        this.loadId = size;
    }

    public int getLoadId() {
        return loadId;
    }
}
