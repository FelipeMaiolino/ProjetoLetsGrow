package br.com.lecom.desafio.letsgrow.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.lecom.desafio.letsgrow.loja.DTO.InfoTransporteDTO;
import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

@Service
public class TranportadoraService {

	public void recebeDadosTranporte(Vendas venda) {
		RestTemplate client = new RestTemplate();
		
		ResponseEntity<InfoTransporteDTO> exchange = client.exchange(
				"http://localhost:8082/trasnportadora/pedido/" + venda.getIdVenda(), 
				HttpMethod.GET, 
				null, 
				InfoTransporteDTO.class);
		
		venda.setIdTransporte(exchange.getBody().getIdTransporte());
		venda.setEstado(exchange.getBody().getEstado());
		venda.setEndereçoEntrega(exchange.getBody().getEndereçoEntrega());
		
		
	}

}
