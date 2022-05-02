package com.paruk.enums;

public enum EHobbies {
    SPORTS("Sports"),
    READING("Reading"),
    MUSIC("Music");

    private String hobbieName;

    EHobbies(String hobbieName) {
        this.hobbieName = hobbieName;
    }

    public String getName() {
        return this.hobbieName;
    }
}
