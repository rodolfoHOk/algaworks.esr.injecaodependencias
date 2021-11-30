package com.algaworks.spring.service;

import org.springframework.stereotype.Component;

import com.algaworks.spring.modelo.Cliente;
import com.algaworks.spring.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}	
}
