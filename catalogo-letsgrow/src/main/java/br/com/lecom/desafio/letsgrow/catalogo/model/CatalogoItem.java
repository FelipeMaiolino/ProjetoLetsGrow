package br.com.lecom.desafio.letsgrow.catalogo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CatalogoItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItem;
	
	private String nomeProduto;
	private BigDecimal valorUnitario;
	private String categoria;
	
	public Long getId() {
		return idItem;
	}
	public void setId(Long id) {
		this.idItem = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
