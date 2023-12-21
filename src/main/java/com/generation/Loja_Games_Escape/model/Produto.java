package com.generation.Loja_Games_Escape.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome do jogo é obrigatório")
	@Column(length = 100) //trava a quantidade de caracteres que terá no banco de dados 
	@Size(min = 3, max = 100, message = "O atributo deve conter no mínimo 3 caracteres e no máximo 100 caracteres")
	private String nomeJ;
	
	@NotBlank(message = "O atributo nome do jogo é obrigatório")
	@Column(length = 100) //trava a quantidade de caracteres que terá no banco de dados 
	@Size(min = 3, max = 100, message = "O atributo deve conter no mínimo 3 caracteres e no máximo 100 caracteres")
	private String console;
	
	@NotNull (message = "Não é possível criar um produto sem o preço!")
    @Positive (message = "O valor do preço deve ser algo positivo!")
    @Column(name="preco", precision=8, scale=2)
    private BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private UsuarioCliente usuarioCliente;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeJ() {
		return nomeJ;
	}

	public void setNomeJ(String nomeJ) {
		this.nomeJ = nomeJ;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public UsuarioCliente getUsuarioCliente() {
		return usuarioCliente;
	}

	public void setUsuarioCliente(UsuarioCliente usuarioCliente) {
		this.usuarioCliente = usuarioCliente;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	

	

	
	

}
