package com.exemplo.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.demo.entidades.Cliente;

public interface RepositorioCliente extends JpaRepository<Cliente, Long> {

}