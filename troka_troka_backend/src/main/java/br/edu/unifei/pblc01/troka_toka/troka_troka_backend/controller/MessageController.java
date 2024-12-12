package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Message;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service.MessageService;

@RestController
@RequestMapping("/message")

public class MessageController {
        @Autowired
    private MessageService messageService;

    //get localhost:8080/message/all
    @GetMapping("/all")
    public List<Message> getAll() {
        return messageService.getAll();
    }

    //get localhost:8080/message/{user}
    @GetMapping("/{user}")
    public Message getMessage(@PathVariable Integer cod) {
        return messageService.getId(cod).orElse(null);
    }

    //insert
    //post localhost:8080/message
    @PostMapping
    public Message postMessage(@RequestBody Message message) {
        return messageService.create(message);
    } 
    
    //update
    //put localhost:8080/message/{user}
    @PutMapping("/{user}")
    public Message putMessage(@RequestBody Message message, @PathVariable Integer cod) {
        return messageService.update(message);
    }    
    
    //delete
    //delete localhost:8080/chat/{user}
    @DeleteMapping("/{user}")
    public void deleteUser(@PathVariable Integer cod) {
        messageService.deleteId(cod);
    }
}
