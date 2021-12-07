package br.com.lecom.desafio.letsgrow.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.desafio.letsgrow.catalogo.model.CatalogoItem;
import br.com.lecom.desafio.letsgrow.catalogo.service.CatalogoService;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
	
	@Autowired
	private CatalogoService catalogoService;
	
	@RequestMapping("/{idItem}")
	public CatalogoItem getInfoPorIdItem(@PathVariable Long idItem) {
		return catalogoService.getItemPorIdItem(idItem);
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<CatalogoItem> getAll() {
		return catalogoService.getAll();
		
	}
	

}
