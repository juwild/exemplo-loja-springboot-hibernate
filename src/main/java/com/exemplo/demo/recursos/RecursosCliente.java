package com.exemplo.demo.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.demo.entidades.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class RecursosCliente {
	@GetMapping
	public ResponseEntity<Cliente> buscarTodosClientes(){
		Cliente cliente = new Cliente(1L, "Ana", "ana@gmail.com","9999-9999","123456");
		return ResponseEntity.ok().body(cliente);
	}
 }
