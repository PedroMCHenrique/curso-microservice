package com.github.cursomicroservice.msclientes.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.cursomicroservice.msclientes.domain.Cliente;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{
	Optional<Cliente> findByCpf(String cpf);	
}