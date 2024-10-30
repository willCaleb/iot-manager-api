package com.will.iotmanager.service.interfaces;

import com.will.iotmanager.model.entity.Device;

import java.util.List;

public interface IDeviceService {

    Device include(Device device);

    Device edit(Integer deviceId, Device device);

    List<Device> listDevices();

    Device findById(Integer id);

    Device findByMacAddress(String macAddress);

    Device include(String macAddress);
}
