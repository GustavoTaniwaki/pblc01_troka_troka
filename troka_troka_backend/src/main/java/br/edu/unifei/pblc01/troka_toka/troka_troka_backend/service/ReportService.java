package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service;

import org.springframework.stereotype.Service;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Report;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.User;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.repository.ReportJPA;

@Service

public class ReportService extends ServiceBase<Report, User, ReportJPA>{
}
