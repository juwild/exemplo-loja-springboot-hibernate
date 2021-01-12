package com.exemplo.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.demo.entidades.Cliente;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Long> {

}