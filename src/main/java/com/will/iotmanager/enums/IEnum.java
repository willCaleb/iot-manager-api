package com.will.iotmanager.enums;

public interface IEnum<E> {

    E getKey();

    String getValue();

    default String getName() {
        return ((Enum) this).name();
    }

}