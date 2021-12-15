package br.com.lecom.desafio.letsgrow.loja.DTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

public class VendasDTO {

	private Long idVenda;
	private Long idItem;
	private int qtd;

	private String nomeProduto;
	private BigDecimal valorUnitario;
	private String categoria;

	private Long idTransporte;
	private String enderecoEntrega;
	private String estado;

	

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setIdTransporte(Long idTransporte) {
		this.idTransporte = idTransporte;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getIdTransporte() {
		return idTransporte;
	}

	public String getEndereçoEntrega() {
		return enderecoEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public String getCategoria() {
		return categoria;
	}

	public Long getIdVenda() {
		return idVenda;
	}

	public int getQtd() {
		return qtd;
	}

	public Long getIdItem() {
		return idItem;
	}



}
