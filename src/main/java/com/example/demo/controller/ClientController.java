package com.example.demo.controller;

import com.example.demo.dto.ClientDto;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // Logica per gestire l'eccezione
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Si è verificato un errore");
    }
}

@BasePathAwareController
public class ClientController {
    @Autowired private ClientService clientService;

    @RequestMapping(path="clients", method=RequestMethod.POST, produces="application/hal+json")
    public @ResponseBody ResponseEntity<ClientDto> postClient(@RequestBody ClientDto client) {
        System.out.println("----CUSTOM---");
        ClientDto postedClient= this.clientService.postClient(client);
        return ResponseEntity.ok(postedClient);
    }
//    @GetMapping("/{id}")
//    public Client getClient(@PathVariable int id) {
//        System.out.println("Client id: " + id);
//        return clientService.getClient(id);
//    }

//    @PutMapping("/{id}")
//    public Client putClient(@PathVariable int id, @RequestBody ClientDto client) {
//        return clientService.putClient(client);
//    }
}
