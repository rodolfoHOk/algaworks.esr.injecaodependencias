package com.algaworks.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.spring.notificacao.NotificadorEmail;

//@Configuration
public class NotificacaoConfig {
	@Bean
	public NotificadorEmail notificadorEmail() {
//		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
//		notificador.setCaixaAlta(true);
		
		return new NotificadorEmail();
	}
}
