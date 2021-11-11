package com.examplebr.com.lecom.desafio.letsgrow.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplebr.com.lecom.desafio.letsgrow.catalogo.modelo.Catalogo;
import com.examplebr.com.lecom.desafio.letsgrow.catalogo.service.CatalogoService;

@RestController
public class CalatogoController {
	
	@Autowired
	private CatalogoService catalogoService;
	
	@RequestMapping("/catalogo")
	public Catalogo getProdutosDoCatalogo() {
		return catalogoService.getProdutosDoCatalogo();
	}

}
