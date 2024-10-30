package com.will.iotmanager.controller;

import com.will.iotmanager.controller.interfaces.IDeviceController;
import com.will.iotmanager.model.dto.DeviceDTO;
import com.will.iotmanager.model.entity.Device;
import com.will.iotmanager.service.interfaces.IDeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeviceController extends AbstractController<Device, DeviceDTO> implements IDeviceController {

    private final IDeviceService deviceService;

    @Override
    public DeviceDTO include(DeviceDTO deviceDTO) {
        System.out.println(deviceDTO);
        return toDto(deviceService.include(toEntity(deviceDTO)));
    }

    @Override
    public DeviceDTO include(String macAddress) {
        return toDto(deviceService.include(macAddress));
    }

}
