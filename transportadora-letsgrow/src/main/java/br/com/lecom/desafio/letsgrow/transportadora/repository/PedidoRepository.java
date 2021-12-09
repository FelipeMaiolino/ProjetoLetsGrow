package br.com.lecom.desafio.letsgrow.transportadora.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lecom.desafio.letsgrow.transportadora.model.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long>{
	
	Pedido findByIdVenda(Long idVenda);

}
