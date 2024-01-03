package com.github.cursomicroservice.msclientes.application.representations;

import com.github.cursomicroservice.msclientes.domain.Cliente;

import lombok.Data;

@Data
public class ClienteSaveRequest {
	private String cpf;
	private String nome;
	private Integer idade;

	public Cliente toModel() {
		return new Cliente(cpf, nome, idade);
	}
}
