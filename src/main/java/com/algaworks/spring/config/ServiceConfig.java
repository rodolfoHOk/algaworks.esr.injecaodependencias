package com.algaworks.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.spring.notificacao.Notificador;
import com.algaworks.spring.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
