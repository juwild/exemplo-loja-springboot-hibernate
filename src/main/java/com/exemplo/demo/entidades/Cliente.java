package com.exemplo.demo.entidades;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;	
	
}
