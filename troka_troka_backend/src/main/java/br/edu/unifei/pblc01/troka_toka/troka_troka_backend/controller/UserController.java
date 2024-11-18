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

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.User;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {
    
    @Autowired
    private UserService userService;

    //get localhost:8080/user/all
    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    //get localhost:8080/user/{string}
    @GetMapping("/{cpf}")
    public User getCPF(@PathVariable String cpf) {
        return userService.getId(cpf).orElse(null);
    }

    //insert
    //post localhost:8080/user
    @PostMapping
    public User postUser(@RequestBody User user) {
        return userService.create(user);
    } 
    
    //update
    //put localhost:8080/user/{string}
    @PutMapping("/{cpf}")
    public User putUser(@RequestBody User user, @PathVariable String cpf) {
        return userService.update(user);
    }    
    
    //delete
    //delete localhost:8080/user/{string}
    @DeleteMapping("/{cpf}")
    public void deleteCPF(@PathVariable String cpf) {
        userService.deleteId(cpf);
    }

}
