package com.algaworks.spring.service;

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
	
//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	    // System.out.println("AtivacaoClienteService: " + notificador);
//	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}	
}
