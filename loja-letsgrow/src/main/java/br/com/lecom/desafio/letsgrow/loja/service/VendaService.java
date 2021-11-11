package br.com.lecom.desafio.letsgrow.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.lecom.desafio.letsgrow.catalogo.DTO.CatalogoDTO;
import br.com.lecom.desafio.letsgrow.loja.DTO.VendaDTO;

public class VendaService {

	public void realizaVenda(VendaDTO venda) {
		
		RestTemplate client = new RestTemplate();
		ResponseEntity<CatalogoDTO> exchange =
				client.exchange("http://localhost:8081/catalogo", HttpMethod.GET, null, CatalogoDTO.class);
	}

}
