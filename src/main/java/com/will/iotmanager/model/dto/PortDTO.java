package com.will.iotmanager.model.dto;

import com.will.iotmanager.enums.EnumPortType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PortDTO extends AbstractDto{

    private Integer id;

    private String description;

    private EnumPortType type;
}
