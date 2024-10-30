package com.will.iotmanager.model.entity;

import com.will.iotmanager.enums.EnumPortType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "iot_port")
public class Port extends AbstractEntity{

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    @Convert(converter = EnumPortType.EnumConverter.class)
    private EnumPortType type;
}
