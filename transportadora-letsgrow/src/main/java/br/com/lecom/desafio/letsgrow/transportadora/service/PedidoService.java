package br.com.lecom.desafio.letsgrow.transportadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lecom.desafio.letsgrow.transportadora.model.Pedido;
import br.com.lecom.desafio.letsgrow.transportadora.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido getPedidoPorIdVenda(Long idVenda) {
		return pedidoRepository.findByIdVenda(idVenda);
	}

}
