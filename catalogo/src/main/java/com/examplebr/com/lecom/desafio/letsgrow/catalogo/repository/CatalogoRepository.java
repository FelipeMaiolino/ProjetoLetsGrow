package com.examplebr.com.lecom.desafio.letsgrow.catalogo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examplebr.com.lecom.desafio.letsgrow.catalogo.modelo.Catalogo;

@Repository
public interface CatalogoRepository extends CrudRepository<Catalogo, Integer>{
	
	Catalogo findAllCatalogo(); 

}
