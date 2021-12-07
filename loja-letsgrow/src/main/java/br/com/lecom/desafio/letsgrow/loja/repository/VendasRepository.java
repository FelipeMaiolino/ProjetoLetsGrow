package br.com.lecom.desafio.letsgrow.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lecom.desafio.letsgrow.loja.modelo.Estado;
import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long> {

	List<Vendas> findByEstado(Estado estado);

}
