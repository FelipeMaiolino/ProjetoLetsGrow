package br.com.lecom.desafio.letsgrow.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.lecom.desafio.letsgrow.loja.DTO.VendasDTO;
import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;
import br.com.lecom.desafio.letsgrow.loja.repository.VendasRepository;
import br.com.lecom.desafio.letsgrow.loja.service.CatalogoService;
import br.com.lecom.desafio.letsgrow.loja.service.TranportadoraService;

@Controller
@RequestMapping("/vendas")
public class VendasController {
	
	@Autowired
	private VendasRepository vendasRepository;
	@Autowired
	private CatalogoService catalogoService;
	@Autowired
	private TranportadoraService trasnportadorService;
	
	
	@GetMapping
	public void ListaVendas(Model model) {
		
		List<Vendas> vendas = vendasRepository.findAll();
		for (Vendas venda : vendas) {
			catalogoService.recebeItem(venda);
			trasnportadorService.recebeDadosTranporte(venda);
		}
		VendasDTO.converter(vendas);
		
		model.addAttribute("vendas", vendas);
		
	}
	

}
