package com.paruk.enums;

public enum EModules {
    ELEMENTS("Elements"),
    FORMS("Forms"),
    ALERTSFRAMEWINDOWS("Alerts, Frame & Windows"),
    WIDGETS("Widgets"),
    INTERACTIONS("Interactions"),
    BOOKSTOREAPPLICATION("Book Store Application");

    private String name;

    EModules(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
