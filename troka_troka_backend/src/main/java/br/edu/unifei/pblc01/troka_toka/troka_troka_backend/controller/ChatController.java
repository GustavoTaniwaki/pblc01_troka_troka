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

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Chat;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.User;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service.ChatService;

@RestController
@RequestMapping("/chat")

public class ChatController {
    @Autowired
    private ChatService chatService;

    //get localhost:8080/chat/all
    @GetMapping("/all")
    public List<Chat> getAll() {
        return chatService.getAll();
    }

    //get localhost:8080/chat/{user}
    @GetMapping("/{user}")
    public Chat getUser(@PathVariable User user) {
        return chatService.getId(user).orElse(null);
    }

    //insert
    //post localhost:8080/chat
    @PostMapping
    public Chat postChat(@RequestBody Chat chat) {
        return chatService.create(chat);
    } 
    
    //update
    //put localhost:8080/chat/{user}
    @PutMapping("/{user}")
    public Chat putChat(@RequestBody Chat chat, @PathVariable User user) {
        return chatService.update(chat);
    }    
    
    //delete
    //delete localhost:8080/chat/{user}
    @DeleteMapping("/{user}")
    public void deleteUser(@PathVariable User user) {
        chatService.deleteId(user);
    }
}
