package com.generation.Loja_Games_Escape.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.Loja_Games_Escape.model.UsuarioCliente;
import com.generation.Loja_Games_Escape.repository.UsuarioClienteRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioClienteRepository usuarioClienteRepository;

	@Override
	public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<UsuarioCliente> usuario = usuarioClienteRepository.findByUsuario(username);

		if (usuario.isPresent())
			return new UserDetailsImpl(usuario.get());
		else
			throw new ResponseStatusException(HttpStatus.FORBIDDEN);

	}

}
