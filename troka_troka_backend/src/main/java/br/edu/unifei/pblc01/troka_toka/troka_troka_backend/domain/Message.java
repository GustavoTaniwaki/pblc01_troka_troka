package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class Message {
  @Id
  @GeneratedValue
  private int cod;
  @ManyToOne
  private User user;
  private String message;
  private Date dateM;
}
