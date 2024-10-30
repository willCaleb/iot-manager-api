package com.will.iotmanager.repository;

import com.will.iotmanager.model.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface DeviceRepository extends JpaRepository<Device, Integer>, JpaSpecificationExecutor<Device> {
    Optional<Device> findByMacAddress(String macAddress);
}
