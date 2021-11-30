package com.algaworks.spring.notificacao;

import com.algaworks.spring.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
}
