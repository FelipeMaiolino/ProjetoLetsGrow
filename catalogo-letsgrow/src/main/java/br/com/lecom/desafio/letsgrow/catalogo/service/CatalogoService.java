package br.com.lecom.desafio.letsgrow.catalogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lecom.desafio.letsgrow.catalogo.model.CatalogoItem;
import br.com.lecom.desafio.letsgrow.catalogo.repository.CatalogoRepository;

@Service
public class CatalogoService {
	
	@Autowired
	private CatalogoRepository catalogoRepository;

	public CatalogoItem getItemPorIdItem(Long idItem) {
		return catalogoRepository.findByIdItem(idItem);
		
	}
	
	public List<CatalogoItem> getAll() {
		return catalogoRepository.findAll();
		
	}

}
