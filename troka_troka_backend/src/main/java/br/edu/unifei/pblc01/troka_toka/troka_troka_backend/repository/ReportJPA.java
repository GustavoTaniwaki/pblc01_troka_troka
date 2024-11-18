package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Report;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.User;

public interface ReportJPA extends JpaRepository<Report, User>{
}
