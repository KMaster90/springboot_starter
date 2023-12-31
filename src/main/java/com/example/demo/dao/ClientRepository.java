package com.example.demo.dao;

import com.example.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByName(String name);

    Client findClientByNameAndId(String name, Integer id);
}
