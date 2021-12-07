package br.com.lecom.desafio.letsgrow.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.lecom.desafio.letsgrow.loja.DTO.ItemDTO;
import br.com.lecom.desafio.letsgrow.loja.service.CatalogoService;

@Controller
public class HomeController {
	
	@Autowired
	private CatalogoService catalogoService;
	
	@GetMapping("/home")
	public void listaItems() {
		
		 List<ItemDTO> itens = catalogoService.rebebeAllItens();
		 
		 System.out.println(itens);

	}

}
