package org.jugistanbul.part1.strategy.good;

public enum DateEnum {

    criticalDate("28/10/2010"), veryCriticalDate("28/10/2011"),
    lowCriticalDate("28/10/2012"), normalCriticalDate("28/10/2013");

    String date;

    DateEnum(String date) {
        this.date = date;
    }
}
