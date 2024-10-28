package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class Rating {
  private float rating;
}
