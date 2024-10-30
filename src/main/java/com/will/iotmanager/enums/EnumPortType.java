package com.will.iotmanager.enums;

import jakarta.persistence.Converter;

public enum EnumPortType implements IEnum<String>{

    INPUT("INPUT", "input"),
    OUTPUT("OUTPUT", "output")
    ;

    private final String key;
    private final String value;

    EnumPortType(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Converter
    public static class EnumConverter extends AbstractEnumConverter<EnumPortType, String> {
    }
}
