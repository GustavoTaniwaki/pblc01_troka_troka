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

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Interest;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service.InterestService;

@RestController
@RequestMapping("/interest")

public class InterestController {
    @Autowired
    private InterestService interestService;

    //get localhost:8080/interest/all
    @GetMapping("/all")
    public List<Interest> getAll() {
        return interestService.getAll();
    }

    //get localhost:8080/interest/{serializable}
    @GetMapping("/{id}")
    public Interest getId(@PathVariable Integer cod) {
        return interestService.getId(cod).orElse(null);
    }

    //insert
    //post localhost:8080/interest
    @PostMapping
    public Interest postInterest(@RequestBody Interest interest) {
        return interestService.create(interest);
    } 
    
    //update
    //put localhost:8080/interest/{serializable}
    @PutMapping("/{id}")
    public Interest putGood(@RequestBody Interest interest, @PathVariable Integer cod) {
        return interestService.update(interest);
    }    
    
    //delete
    //delete localhost:8080/interest/{serializable}
    @DeleteMapping("/{id}")
    public void deleteId(@PathVariable Integer cod) {
        interestService.deleteId(cod);
    }
}
