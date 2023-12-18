package com.example.demo.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.demo.entity.Supplier}
 */
@Value
public class SupplierDto implements Serializable {
    Integer id;
    String name;
}
