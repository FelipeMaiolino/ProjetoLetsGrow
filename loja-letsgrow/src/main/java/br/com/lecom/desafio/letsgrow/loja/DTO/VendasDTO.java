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

	public VendasDTO(Vendas vendas) {
		this.idVenda = vendas.getIdVenda();
		this.idItem = vendas.getIdItem();
		this.qtd = vendas.getQtd();
		
		this.categoria = vendas.getCategoria();
		this.nomeProduto = vendas.getNomeProduto();
		this.valorUnitario = vendas.getValorUnitario();
		
		this.idTransporte = vendas.getIdTransporte();
		this.enderecoEntrega = vendas.getEnderecoEntrega();
		this.estado = vendas.getEstado();
		
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

	public static List<VendasDTO> converter(List<Vendas> vendas) {
		return vendas.stream().map(VendasDTO::new).collect(Collectors.toList());
	}


}
