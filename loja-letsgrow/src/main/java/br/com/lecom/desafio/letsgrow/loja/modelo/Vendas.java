package br.com.lecom.desafio.letsgrow.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVenda;
	private Long idItem;
	private int qtd;
	
	private String nomeProduto;
	private BigDecimal valorUnitario;
	private String categoria;
	
	private Long idTransporte;
	private String enderecoEntrega;
	private String estado;
	
	
	
	public Long getIdTransporte() {
		return idTransporte;
	}
	public void setIdTransporte(Long idTransporte) {
		this.idTransporte = idTransporte;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEndereçoEntrega(String endereçoEntrega) {
		this.enderecoEntrega = endereçoEntrega;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public Long getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Long id) {
		this.idVenda = id;
	}
	public Long getIdItem() {
		return idItem;
	}
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}
