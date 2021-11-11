package br.com.lecom.desafio.letsgrow.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.desafio.letsgrow.loja.DTO.VendaDTO;
import br.com.lecom.desafio.letsgrow.loja.service.VendaService;

@RestController
@RequestMapping("/venda")
public class VendaController  {
	
	@Autowired
	private VendaService vendaService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizaVenda(@RequestBody VendaDTO venda) {
		vendaService.realizaVenda(venda);
	}

}
