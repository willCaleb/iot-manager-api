package com.will.iotmanager.enums;

import jakarta.persistence.Converter;

public enum EnumDeviceType implements IEnum<String>{
    ESP32("ESP32", "Esp32"),
    ESP8266("ESP8266", "Esp8266")
    ;

    private final String key;
    private final String value;

    EnumDeviceType(String key, String value) {
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
    public static class EnumConverter extends AbstractEnumConverter<EnumDeviceType, String> {
    }
}
