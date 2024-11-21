package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Good;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.repository.GoodJPA;

@Service

public class GoodService extends ServiceBase<Good, Serializable, GoodJPA>{
}
