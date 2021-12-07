package br.com.lecom.desafio.letsgrow.loja.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.lecom.desafio.letsgrow.loja.DTO.ItemDTO;
import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

@Service
public class CatalogoService {

	public void recebeItem(Vendas venda) {

		RestTemplate client = new RestTemplate();

		ResponseEntity<ItemDTO> exchange = client.exchange(
				"http://localhost:8081/catalogo/" + venda.getIdItem(), 
				HttpMethod.GET, 
				null, 
				ItemDTO.class);

		venda.setNomeProduto(exchange.getBody().getNomeProduto());
		venda.setValorUnitario(exchange.getBody().getValorUnitario());
		venda.setCategoria(exchange.getBody().getCategoria());

		System.out.println(exchange.getBody());
	}
	
	public void recebeItemPorEstado(Vendas venda) {

		RestTemplate client = new RestTemplate();

		ResponseEntity<ItemDTO> exchange = client.exchange(
				"http://localhost:8081/catalogo/" + venda.getIdItem(), 
				HttpMethod.GET, 
				null, 
				ItemDTO.class);

		venda.setNomeProduto(exchange.getBody().getNomeProduto());
		venda.setValorUnitario(exchange.getBody().getValorUnitario());
		venda.setCategoria(exchange.getBody().getCategoria());

		System.out.println(exchange.getBody());
	}	
	

	public List<ItemDTO> rebebeAllItens() {

		RestTemplate client = new RestTemplate();

		ResponseEntity<List<ItemDTO>> exchange = client.exchange(
				"http://localhost:8081/catalogo/all", 
				HttpMethod.GET,
				null, 
				new ParameterizedTypeReference <List<ItemDTO>>() {
				});
		
		List<ItemDTO> ListaItens = exchange.getBody();
			
		return ListaItens;
	}

}
