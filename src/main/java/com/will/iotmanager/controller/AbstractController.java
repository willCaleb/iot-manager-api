package com.will.iotmanager.controller;

import com.will.iotmanager.model.dto.AbstractDto;
import com.will.iotmanager.model.entity.AbstractEntity;
import org.modelmapper.ModelMapper;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AbstractController<E extends AbstractEntity, DTO extends AbstractDto> {

    Type[] genericTypes = ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments();
    private final Class<E> entityClass = (Class<E>) genericTypes[0];
    private final Class<DTO> dtoClass = (Class<DTO>) genericTypes[1];


    protected E toEntity(DTO dto) {
        return new ModelMapper().map(dto, entityClass);
    }

    protected DTO toDto(E entity) {
        return new ModelMapper().map(entity, dtoClass);
    }

    protected List<E> toEntity(List<DTO> dtoList) {
        List<E> entities = new ArrayList<>();

        dtoList.forEach(dto -> entities.add(toEntity(dto)));

        return entities;
    }

    protected List<DTO> toDto(List<E> entityList) {
        List<DTO> dtos = new ArrayList<>();

        entityList.forEach(entity -> dtos.add(toDto(entity)));

        return dtos;
    }

}