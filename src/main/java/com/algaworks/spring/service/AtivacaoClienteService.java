package com.algaworks.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.spring.modelo.Cliente;
import com.algaworks.spring.notificacao.NivelDeUrgencia;
import com.algaworks.spring.notificacao.Notificador;
import com.algaworks.spring.notificacao.TipoDeNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDeNotificador(NivelDeUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@PostConstruct
	public void init() {
		System.out.println("INIT");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
