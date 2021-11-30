package com.algaworks.spring.notificacao;

import com.algaworks.spring.modelo.Cliente;

//@Profile("dev")
@TipoDeNotificador(NivelDeUrgencia.SEM_URGENCIA)
//@Component
public class NotificadorEmailMock implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
