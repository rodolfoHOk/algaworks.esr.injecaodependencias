package com.algaworks.spring.config;

import org.springframework.context.annotation.Bean;

import com.algaworks.spring.service.AtivacaoClienteService;

// @Configuration
public class ServiceConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService();
	}
}
