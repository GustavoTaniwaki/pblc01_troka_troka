package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class Trade {
    @Id
    @GeneratedValue
    private int cod;
    @ManyToOne
    private Rating ratingOwner;
    @ManyToOne
    private Rating ratingInterested;
    private Date date;
    private String state;
    private Float compensation;
    @ManyToMany
    private List<Good> cart = new ArrayList<>();
}
