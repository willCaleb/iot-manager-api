package com.will.iotmanager.service;

import com.will.iotmanager.Utils;
import com.will.iotmanager.model.entity.Device;
import com.will.iotmanager.repository.DeviceRepository;
import com.will.iotmanager.service.interfaces.IDeviceService;
import com.will.iotmanager.validator.DeviceValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceService implements IDeviceService {

    private final DeviceRepository deviceRepository;


    @Override
    public Device include(Device device) {

        DeviceValidator.validateInsert(device);

        Device byMacAddress = findByMacAddress(device.getMacAddress());

        if (Utils.isNotEmpty(byMacAddress)) {
            return byMacAddress;
        }

        return deviceRepository.save(device);
    }

    @Override
    public Device include(String macAddress) {

        Device device = new Device();
        device.setMacAddress(macAddress);
        return deviceRepository.save(device);
    }

    @Override
    public Device edit(Integer deviceId, Device device) {

        Device deviceManaged = findById(deviceId);
        deviceManaged.setName(Utils.nvl(device.getName(), deviceManaged.getName()));
        deviceManaged.setDescription(Utils.nvl(device.getDescription(), deviceManaged.getDescription()));
        return deviceRepository.save(deviceManaged);
    }

    @Override
    public List<Device> listDevices() {
        return deviceRepository.findAll();
    }

    @Override
    public Device findById(Integer id) {
        return deviceRepository.findById(id).orElseThrow(() -> new RuntimeException("Dispositivo não localizado"));
    }

    @Override
    public Device findByMacAddress(String macAddress) {
        return deviceRepository.findByMacAddress(macAddress).orElse(null);
    }
}
