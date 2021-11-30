package com.algaworks.spring.service;

import org.springframework.stereotype.Component;

import com.algaworks.spring.modelo.Cliente;
import com.algaworks.spring.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}	
}
