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

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Rating;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service.RatingService;

@RestController
@RequestMapping("/rating")

public class RatingController {
    @Autowired
    private RatingService ratingService;

    //get localhost:8080/rating/all
    @GetMapping("/all")
    public List<Rating> getAll() {
        return ratingService.getAll();
    }

    //get localhost:8080/rating/{user}
    @GetMapping("/{user}")
    public Rating getRating(@PathVariable Integer cod) {
        return ratingService.getId(cod).orElse(null);
    }

    //insert
    //post localhost:8080/rating
    @PostMapping
    public Rating postRating(@RequestBody Rating rating) {
        return ratingService.create(rating);
    } 
    
    //update
    //put localhost:8080/rating/{user}
    @PutMapping("/{user}")
    public Rating putRating(@RequestBody Rating rating, @PathVariable Integer cod) {
        return ratingService.update(rating);
    }    
    
    //delete
    //delete localhost:8080/rating/{user}
    @DeleteMapping("/{user}")
    public void deleteId(@PathVariable Integer cod) {
        ratingService.deleteId(cod);
    }
}
