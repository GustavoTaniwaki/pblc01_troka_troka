package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Trade;

public interface TradeJPA extends JpaRepository<Trade, Serializable>{
}
