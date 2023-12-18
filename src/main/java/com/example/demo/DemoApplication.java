package com.example.demo;

import com.example.demo.dao.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public DemoApplication(ClientRepository clientRepository) {
        System.out.println(clientRepository.findAll().getFirst());
    }

}
