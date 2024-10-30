package com.will.iotmanager.enums;

import jakarta.persistence.Converter;

public enum EnumSensorType implements IEnum<String>{

    DIGITAL("DIGITAL", "digital"),
    ANALOG("ANALOG", "analog")
    ;

    private final String key;
    private final String value;

    EnumSensorType(String key, String value) {
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
    public static class EnumConverter extends AbstractEnumConverter<EnumSensorType, String> {
    }
}
