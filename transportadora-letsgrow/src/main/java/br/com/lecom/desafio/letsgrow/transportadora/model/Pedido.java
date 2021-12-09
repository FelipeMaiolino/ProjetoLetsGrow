package br.com.lecom.desafio.letsgrow.transportadora.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTransporte;
	private Long idVenda;
	private String endereçoEntrega;
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
	public Long getIdTransporte() {
		return idTransporte;
	}
	public void setIdTransporte(Long idTransporte) {
		this.idTransporte = idTransporte;
	}
	public Long getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}
	public String getEndereçoEntrega() {
		return endereçoEntrega;
	}
	public void setEndereçoEntrega(String endereçoEntrega) {
		this.endereçoEntrega = endereçoEntrega;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	
}
