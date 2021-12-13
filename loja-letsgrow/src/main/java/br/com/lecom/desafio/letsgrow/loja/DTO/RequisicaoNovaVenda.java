package br.com.lecom.desafio.letsgrow.loja.DTO;

import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

public class RequisicaoNovaVenda {

	private Long idItem;
	private int qtd;
	private String enderecoEntrega;
	
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
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public Vendas toVendas() {
		Vendas venda = new Vendas();
		venda.setIdItem(idItem);
		venda.setQtd(qtd);
		return venda;
	}
	public NovaEntregaDTO toEntrega() {
		NovaEntregaDTO novaEntrega = new NovaEntregaDTO();
		novaEntrega.setEnderecoEntrega(enderecoEntrega);
		return novaEntrega;
	}
	
	
}
