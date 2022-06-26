package com.paruk.enums;

public enum ESubForms {

    PRACTICEFORM("Practice Form");

    private String subModuleName;

    ESubForms(String subModuleName){
        this.subModuleName = subModuleName;
    }

    public String getName() {
        return this.subModuleName;
    }
}
