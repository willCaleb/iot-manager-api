package com.will.iotmanager.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserDTO extends AbstractDto{

    private Integer id;

    private String username;

    private String password;
}
