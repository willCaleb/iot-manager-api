package com.will.iotmanager.model;

import jakarta.persistence.Transient;
import lombok.Data;


@Data
public class Message {

    @Transient
    private String message;
}
