package com.will.iotmanager.controller.interfaces;

import com.will.iotmanager.model.dto.DeviceDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/device")
public interface IDeviceController {

    @PostMapping
    DeviceDTO include(@RequestBody DeviceDTO deviceDTO);

    @PostMapping("/serial")
    DeviceDTO include(@RequestParam("macAddress") String macAddress);

}
