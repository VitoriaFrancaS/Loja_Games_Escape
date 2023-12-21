package com.generation.Loja_Games_Escape.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.generation.Loja_Games_Escape.model.UsuarioCliente;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Long> {

	public Optional<UsuarioCliente> findByUsuario(String usuarioCliente);
}
