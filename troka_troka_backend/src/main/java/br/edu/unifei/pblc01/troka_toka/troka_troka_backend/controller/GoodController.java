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

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Good;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service.GoodService;

@RestController
@RequestMapping("/good")

public class GoodController {
    @Autowired
    private GoodService goodService;

    //get localhost:8080/good/all
    @GetMapping("/all")
    public List<Good> getAll() {
        return goodService.getAll();
    }

    //get localhost:8080/good/{serializable}
    @GetMapping("/{id}")
    public Good getId(@PathVariable Integer cod) {
        return goodService.getId(cod).orElse(null);
    }

    //insert
    //post localhost:8080/good
    @PostMapping
    public Good postGood(@RequestBody Good good) {
        return goodService.create(good);
    } 
    
    //update
    //put localhost:8080/good/{serializable}
    @PutMapping("/{cpf}")
    public Good putGood(@RequestBody Good good, @PathVariable Integer cod) {
        return goodService.update(good);
    }    
    
    //delete
    //delete localhost:8080/good/{serializable}
    @DeleteMapping("/{cpf}")
    public void deleteId(@PathVariable Integer cod) {
        goodService.deleteId(cod);
    }
}
