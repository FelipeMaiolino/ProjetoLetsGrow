package br.com.lecom.desafio.letsgrow.loja.DTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

public class VendasDTO {

	private Long idVenda;
	private Long idItem;
	private int qtd;
	private String enderecoEntrega;
	private String nomeProduto;
	private BigDecimal valorUnitario;
	private String categoria;

	public VendasDTO(Vendas vendas) {
		this.idVenda = vendas.getIdVenda();
		this.idItem = vendas.getIdItem();
		this.qtd = vendas.getQtd();
		this.enderecoEntrega = vendas.getEnderecoEntrega();
		this.nomeProduto = vendas.getNomeProduto();
		this.valorUnitario = vendas.getValorUnitario();
		this.categoria = vendas.getCategoria();
		
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

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public Long getIdItem() {
		return idItem;
	}

	public static List<VendasDTO> converter(List<Vendas> vendas) {
		return vendas.stream().map(VendasDTO::new).collect(Collectors.toList());
	}

}
