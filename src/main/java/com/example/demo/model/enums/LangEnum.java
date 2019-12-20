package com.example.demo.model.enums;

public enum LangEnum {
    en("en"), th("th");

    private String label;

    LangEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
