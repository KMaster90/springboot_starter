package com.example.demo.dto;

import com.example.demo.entity.Client;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Client}
 */
@Value
public class ClientDto implements Serializable {
    Integer id;
    String name;
}
