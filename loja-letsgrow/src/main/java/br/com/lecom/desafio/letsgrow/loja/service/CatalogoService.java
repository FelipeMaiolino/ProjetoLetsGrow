package br.com.lecom.desafio.letsgrow.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.lecom.desafio.letsgrow.loja.DTO.infoCatalogoDTO;
import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

@Service
public class CatalogoService {

	public void recebeItem(Vendas venda) {
		
		RestTemplate client = new RestTemplate();
		
		ResponseEntity<infoCatalogoDTO> exchange = client.exchange("http://localhost:8081/catalogo/" + venda.getIdItem(), 
				HttpMethod.GET, 
				null,
				infoCatalogoDTO.class);
		
		venda.setNomeProduto(exchange.getBody().getNomeProduto());
		venda.setValorUnitario(exchange.getBody().getValorUnitario());
		venda.setCategoria(exchange.getBody().getCategoria());
		
		System.out.println(exchange.getBody().getNomeProduto());
		System.out.println(exchange.getBody().getCategoria());
		System.out.println(exchange.getBody().getValorUnitario());
	}

}
