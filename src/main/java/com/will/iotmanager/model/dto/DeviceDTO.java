package com.will.iotmanager.model.dto;

import com.will.iotmanager.enums.EnumDeviceType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DeviceDTO extends AbstractDto{

    private Integer id;

    private String name;

    private EnumDeviceType type;

    private String description;

    private String macAddress;

}
