package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data

public class Report {
    @Id
    @GeneratedValue
    private int cod;
    @ManyToOne
    private User reportingClient;
    @ManyToOne
    private User reportedClient;
    @OneToOne
    private Trade trade;
    @ManyToMany
    private List<Message> mensagensReportadas = new ArrayList<>();
    @ManyToOne
    private Chat chatReportado;
}
