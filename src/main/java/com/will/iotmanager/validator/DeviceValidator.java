package com.will.iotmanager.validator;

import com.will.iotmanager.Utils;
import com.will.iotmanager.model.entity.Device;
import org.springframework.stereotype.Component;

public class DeviceValidator {
    public static void validateInsert(Device device) {
        if (Utils.isEmpty(device.getMacAddress())) {
            throw new RuntimeException("Mac address é obrigatório");
        }
    }
}
