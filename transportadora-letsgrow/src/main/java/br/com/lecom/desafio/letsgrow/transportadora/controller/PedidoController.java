package br.com.lecom.desafio.letsgrow.transportadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.desafio.letsgrow.transportadora.model.Pedido;
import br.com.lecom.desafio.letsgrow.transportadora.service.PedidoService;

@RestController
@RequestMapping("/trasnportadora/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping("/{idVenda}")
	public Pedido getInfoPorIdVenda(@PathVariable Long idVenda) {
		return pedidoService.getPedidoPorIdVenda(idVenda);
	}
	
	@PostMapping("/novo")
	public void postNovoPedido(@RequestBody Pedido pedido) {
		System.out.println(pedido.getIdTransporte());
		pedidoService.novoPedido(pedido);
	}
	

}
