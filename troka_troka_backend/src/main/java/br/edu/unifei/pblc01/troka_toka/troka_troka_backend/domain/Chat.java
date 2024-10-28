package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class Chat extends Message{
  private List<Message> ownership = new ArrayList<>();
}
