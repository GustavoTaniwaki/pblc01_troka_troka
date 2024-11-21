package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class Interest {
  @Id
  @GeneratedValue
  private int cod;
  private Float value;
  private String category;
  private String conservationState;
  private String addres;
  //@ManyToOne
  //private List<String> keywords = new ArrayList<>();
  @ManyToOne
  private User user;
}
