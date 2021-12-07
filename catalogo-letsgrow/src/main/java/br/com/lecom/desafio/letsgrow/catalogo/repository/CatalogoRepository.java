package br.com.lecom.desafio.letsgrow.catalogo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lecom.desafio.letsgrow.catalogo.model.CatalogoItem;

@Repository
public interface CatalogoRepository extends CrudRepository<CatalogoItem, Long> {
	
	CatalogoItem findByIdItem(Long idItem);
	
	List<CatalogoItem> findAll();

}
