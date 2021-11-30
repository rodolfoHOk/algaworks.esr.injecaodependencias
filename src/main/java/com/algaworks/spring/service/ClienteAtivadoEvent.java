package com.algaworks.spring.service;

import com.algaworks.spring.modelo.Cliente;

public class ClienteAtivadoEvent {
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
