package com.will.iotmanager.model.entity;

import com.will.iotmanager.enums.EnumDeviceType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "iot_device")
public class Device extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    @Convert(converter = EnumDeviceType.EnumConverter.class)
    private EnumDeviceType type;

    @Column(name = "description")
    private String description;

    @Column(name = "mac_address", unique = true)
    private String macAddress;

}
