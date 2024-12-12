package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service;

import org.springframework.stereotype.Service;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Rating;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.repository.RatingJPA;

@Service

public class RatingService extends ServiceBase<Rating, Integer, RatingJPA>{
}
