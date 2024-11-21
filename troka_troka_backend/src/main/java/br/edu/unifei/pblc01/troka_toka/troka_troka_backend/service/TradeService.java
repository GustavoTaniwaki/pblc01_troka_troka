package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Trade;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.repository.TradeJPA;

@Service

public class TradeService extends ServiceBase<Trade, Serializable, TradeJPA>{
}
