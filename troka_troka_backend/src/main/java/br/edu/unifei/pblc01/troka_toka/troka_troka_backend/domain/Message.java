package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Message {
  @Id
  private User user;
  private String message;
  private Date dateM;
}
