package com.paruk.enums;

public enum ESubElements {

    TEXTBOX("Text Box"),
    CHECKBOX("Check Box"),
    RADIOBUTTON("Radio Button"),
    WEBTABLES("Web Tables"),
    BUTTONS("Buttons"),
    LINKS("Links"),
    BROKENLINKSIMG("Broken Links - Images"),
    UPLOADNDOWNLOAD("Upload and Download"),
    DYNAMICPROPERTIES("Dynamic Properties");

    private String subModuleName;

    ESubElements(String subModuleName){
        this.subModuleName = subModuleName;
    }

    public String getName() {
        return this.subModuleName;
    }
}
