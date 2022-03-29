package com.paruk.enums;

public enum ESubForms implements ISubModules{

    PRACTICEFORM("Practice Form");

    private String subModuleName;

    ESubForms(String subModuleName){
        this.subModuleName = subModuleName;
    }

    @Override
    public String getName() {
        return this.subModuleName;
    }
}
