package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)

public class Rating extends Message{
  private float rating;
}
