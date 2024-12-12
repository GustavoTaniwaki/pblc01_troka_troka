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

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Report;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service.ReportService;


@RestController
@RequestMapping("/report")

public class ReportController {
@Autowired
    private ReportService reportService;

    //get localhost:8080/report/all
    @GetMapping("/all")
    public List<Report> getAll() {
        return reportService.getAll();
    }

    //get localhost:8080/report/{user}
    @GetMapping("/{user}")
    public Report getReport(@PathVariable Integer cod) {
        return reportService.getId(cod).orElse(null);
    }

    //insert
    //post localhost:8080/report
    @PostMapping
    public Report postReport(@RequestBody Report report) {
        return reportService.create(report);
    } 
    
    //update
    //put localhost:8080/report/{user}
    @PutMapping("/{user}")
    public Report putRating(@RequestBody Report report, @PathVariable Integer cod) {
        return reportService.update(report);
    }    
    
    //delete
    //delete localhost:8080/report/{user}
    @DeleteMapping("/{user}")
    public void deleteId(@PathVariable Integer cod) {
        reportService.deleteId(cod);
    }
}
