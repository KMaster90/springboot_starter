package com.example.demo.utils.mapper;

import com.example.demo.dto.ClientDto;
import com.example.demo.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);
    Client dtoToEntity(ClientDto dto);
    ClientDto entityToDto(Client entity);
}
