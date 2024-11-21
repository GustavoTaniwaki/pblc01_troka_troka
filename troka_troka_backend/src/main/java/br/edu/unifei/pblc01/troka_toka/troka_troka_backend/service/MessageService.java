package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service;

import org.springframework.stereotype.Service;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Message;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.User;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.repository.MessageJPA;

@Service

public class MessageService extends ServiceBase<Message, User, MessageJPA>{
}
