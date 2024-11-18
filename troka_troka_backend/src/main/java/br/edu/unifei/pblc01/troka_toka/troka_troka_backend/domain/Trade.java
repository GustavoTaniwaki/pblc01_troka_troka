package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Trade {
    @Id
    private Serializable id;
    private Rating ratingOwner;
    private Rating ratingInterested;
    private Date date;
    private String state;
    private Float compensation;
    private List<Good> cart = new ArrayList<>();
}
