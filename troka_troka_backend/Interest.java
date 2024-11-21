package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
  private List<String> keyworlds = new ArrayList<>();
  private User user;
}
