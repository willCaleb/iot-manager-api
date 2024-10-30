package com.will.iotmanager.repository;

import com.will.iotmanager.model.entity.Port;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PortRepository extends JpaRepository<Port,Integer>, JpaSpecificationExecutor<Port> {
}
