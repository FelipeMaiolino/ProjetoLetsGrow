package com.examplebr.com.lecom.desafio.letsgrow.catalogo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplebr.com.lecom.desafio.letsgrow.catalogo.modelo.Catalogo;
import com.examplebr.com.lecom.desafio.letsgrow.catalogo.repository.CatalogoRepository;

@Service
public class CatalogoService {

	@Autowired
	private CatalogoRepository catalogoRepository;
	
	public Catalogo getProdutosDoCatalogo() {
		return catalogoRepository.findAllCatalogo();
	}

}
