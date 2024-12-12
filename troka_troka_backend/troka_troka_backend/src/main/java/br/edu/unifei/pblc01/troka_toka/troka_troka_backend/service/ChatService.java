package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.service;

import org.springframework.stereotype.Service;

import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain.Chat;
import br.edu.unifei.pblc01.troka_toka.troka_troka_backend.repository.ChatJPA;

@Service

public class ChatService extends ServiceBase<Chat, Integer, ChatJPA>{
}
