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

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Trade;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service.TradeService;

@RestController
@RequestMapping("/trade")

public class TradeController {
@Autowired
    private TradeService tradeService;

    //get localhost:8080/trade/all
    @GetMapping("/all")
    public List<Trade> getAll() {
        return tradeService.getAll();
    }

    //get localhost:8080/trade/{serializable}
    @GetMapping("/{id}")
    public Trade getId(@PathVariable Integer cod) {
        return tradeService.getId(cod).orElse(null);
    }

    //insert
    //post localhost:8080/trade
    @PostMapping
    public Trade postTrade(@RequestBody Trade trade) {
        return tradeService.create(trade);
    } 
    
    //update
    //put localhost:8080/trade/{serializable}
    @PutMapping("/{id}")
    public Trade putGood(@RequestBody Trade trade, @PathVariable Integer cod) {
        return tradeService.update(trade);
    }    
    
    //delete
    //delete localhost:8080/trade/{serializable}
    @DeleteMapping("/{id}")
    public void deleteId(@PathVariable Integer cod) {
        tradeService.deleteId(cod);
    }
}
