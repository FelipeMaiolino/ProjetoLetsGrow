package br.com.lecom.desafio.letsgrow.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long> {


}
