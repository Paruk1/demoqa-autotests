package com.paruk.enums;

public enum EMonth {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String month;

    EMonth(String month) {
        this.month = month;
    }

    public String getName() {
        return this.month;
    }
}
