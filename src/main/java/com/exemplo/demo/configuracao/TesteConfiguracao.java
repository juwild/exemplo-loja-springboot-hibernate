package com.exemplo.demo.configuracao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exemplo.demo.entidades.Cliente;
import com.exemplo.demo.repositorios.RepositorioCliente;

@Configuration
@Profile("test")
public class TesteConfiguracao  implements CommandLineRunner {

	@Autowired
	private RepositorioCliente repositorioCliente;

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente_01 = new Cliente(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Cliente cliente_02 = new Cliente(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		repositorioCliente.saveAll(Arrays.asList(cliente_01, cliente_02));
	}
}
