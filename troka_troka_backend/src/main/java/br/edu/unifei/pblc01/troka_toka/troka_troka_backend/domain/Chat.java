package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)

public class Chat extends Message{
  private List<Message> ownership = new ArrayList<>();
}
