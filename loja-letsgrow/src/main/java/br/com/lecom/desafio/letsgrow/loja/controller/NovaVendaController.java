package br.com.lecom.desafio.letsgrow.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lecom.desafio.letsgrow.loja.DTO.NovaEntregaDTO;
import br.com.lecom.desafio.letsgrow.loja.DTO.RequisicaoNovaVenda;
import br.com.lecom.desafio.letsgrow.loja.DTO.VendasDTO;
import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;
import br.com.lecom.desafio.letsgrow.loja.repository.VendasRepository;
import br.com.lecom.desafio.letsgrow.loja.service.TranportadoraService;

@Controller
@RequestMapping(method = RequestMethod.POST)
public class NovaVendaController {
	
	@Autowired
	private VendasRepository vendasRepository;
	@Autowired
	private TranportadoraService trasnportadorService;
	
	@GetMapping("/novaVenda")
	public void novaVenda() {
	}	
	
	
	@GetMapping("/novo")
	public String novo(RequisicaoNovaVenda requisicao) {
		
		Vendas venda = requisicao.toVendas();
		//vendasRepository.save(venda);
		
		NovaEntregaDTO novaEntrega = requisicao.toEntrega();
		novaEntrega.setIdVenda(venda.getIdVenda());
		
		trasnportadorService.mandandoDadosTransporte(novaEntrega);
		
		return "/novaVenda";
		
	}
		
	


}
