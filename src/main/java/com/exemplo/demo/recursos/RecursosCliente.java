package com.exemplo.demo.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.demo.entidades.Cliente;
import com.exemplo.demo.servicos.ServicoCliente;

@RestController
@RequestMapping(value = "/clientes")
public class RecursosCliente {

	@Autowired
	private ServicoCliente servicoCliente;

	@GetMapping
	public ResponseEntity<List<Cliente>> buscarTodosClientes() {
		List<Cliente> listaClientes = servicoCliente.buscarTodosClientes();
		return ResponseEntity.ok().body(listaClientes);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> buscarClienteId(@PathVariable Long id) {
		Cliente obj = servicoCliente.buscarClienteId(id);
		return ResponseEntity.ok().body(obj);
	}
}
