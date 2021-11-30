package com.algaworks.spring.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.spring.modelo.Cliente;

//@Primary
@TipoDeNotificador(NivelDeUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}
