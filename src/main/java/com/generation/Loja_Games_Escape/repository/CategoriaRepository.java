package com.generation.Loja_Games_Escape.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; //A interface JPAREPOSITORY contém todos os métodos para fazer o CRUD
import org.springframework.data.repository.query.Param;

import com.generation.Loja_Games_Escape.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List <Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
}
