package com.examplebr.com.lecom.desafio.letsgrow.catalogo.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Catalogo {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		@Enumerated(EnumType.STRING)
		private Categoria categoria;
		private String nome;
		private BigDecimal precoUnitario;
		
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public BigDecimal getPrecoUnitario() {
			return precoUnitario;
		}
		public void setPrecoUnitario(BigDecimal precoUnitario) {
			this.precoUnitario = precoUnitario;
		}
		public Integer getId() {
			return id;
		}
		
		
	}

