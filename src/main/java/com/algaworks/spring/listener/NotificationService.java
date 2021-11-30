package com.algaworks.spring.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.spring.notificacao.NivelDeUrgencia;
import com.algaworks.spring.notificacao.Notificador;
import com.algaworks.spring.notificacao.TipoDeNotificador;
import com.algaworks.spring.service.ClienteAtivadoEvent;

@Component
public class NotificationService {
	
	@TipoDeNotificador(NivelDeUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativado!");
	}

}
