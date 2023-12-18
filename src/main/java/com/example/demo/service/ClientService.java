package com.example.demo.service;

import com.example.demo.dao.ClientRepository;
import com.example.demo.dto.ClientDto;
import com.example.demo.entity.Client;
import com.example.demo.utils.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClientService {
    @Autowired private ClientRepository clientRepository;

    public Client getClient(int id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Client not found"));
    }

    public ClientDto postClient(ClientDto clientDto) {
        Client newClient = ClientMapper.INSTANCE.dtoToEntity(clientDto);
        Client clientFromDb = clientRepository.save(newClient);
        return ClientMapper.INSTANCE.entityToDto(clientFromDb);
    }

//    public Client putClient(ClientDto clientDto) {
//        System.out.println("PUT - Client: " + clientDto);
//        Client newClient = ClientMapper.INSTANCE.dtoToEntity(clientDto);
//
//        return clientRepository.save(newClient);
//    }
}
