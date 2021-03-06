package com.algaworks.spring.config;

import org.springframework.context.annotation.Bean;

import com.algaworks.spring.notificacao.NotificadorEmail;
import com.algaworks.spring.service.AtivacaoClienteService;

//@Configuration
public class AlgaConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
//		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
//		notificador.setCaixaAlta(true);
		
		return new NotificadorEmail();
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService();
	}
	
}
