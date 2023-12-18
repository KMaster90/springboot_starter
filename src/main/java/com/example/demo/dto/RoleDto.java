package com.example.demo.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.demo.entity.Role}
 */
@Value
public class RoleDto implements Serializable {
    Integer id;
    String name;
}
