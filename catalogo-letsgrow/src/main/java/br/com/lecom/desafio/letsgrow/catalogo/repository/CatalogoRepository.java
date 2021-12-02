package br.com.lecom.desafio.letsgrow.catalogo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lecom.desafio.letsgrow.catalogo.model.CatalogoItem;

@Repository
public interface CatalogoRepository extends CrudRepository<CatalogoItem, Long> {
	
	CatalogoItem findByIdItem(Long idItem);

}
