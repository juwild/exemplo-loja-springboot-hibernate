package com.exemplo.demo.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.exemplo.demo.entidades.Cliente;
import com.exemplo.demo.repositorios.RepositorioCliente;

@Component
public class ServicoCliente {
	
	@Autowired
	private RepositorioCliente repositorioCliente;
	
	public List<Cliente> buscarTodosClientes() {
		return repositorioCliente.findAll();
	}
	
	public Cliente buscarClienteId(Long id) {
		Optional<Cliente> objetoCliente = repositorioCliente.findById(id);
		return objetoCliente.get();
	}

}
