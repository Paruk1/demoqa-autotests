package com.paruk.enums;

public enum EModules {
    ELEMENTS("Elements"),
    FORMS("Forms"),
    ALERTSFRAMEWINDOWS("Alerts, Frame & Windows"),
    WIDGETS("Widgets"),
    INTERACTIONS("Interactions"),
    BOOKSTOREAPPLICATION("Book Store Application");

    private String moduleName;

    EModules(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getName() {
        return this.moduleName;
    }
}
