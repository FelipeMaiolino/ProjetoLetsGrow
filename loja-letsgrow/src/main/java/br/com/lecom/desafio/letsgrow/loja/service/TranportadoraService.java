package br.com.lecom.desafio.letsgrow.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.lecom.desafio.letsgrow.loja.DTO.InfoTransporteDTO;
import br.com.lecom.desafio.letsgrow.loja.DTO.NovaEntregaDTO;
import br.com.lecom.desafio.letsgrow.loja.DTO.VendasDTO;
import br.com.lecom.desafio.letsgrow.loja.modelo.Vendas;

@Service
public class TranportadoraService {

	public void recebeDadosTranporte(VendasDTO vendaDTO) {
		RestTemplate client = new RestTemplate();
		
		ResponseEntity<InfoTransporteDTO> exchange = client.exchange(
				"http://localhost:8082/trasnportadora/pedido/" + vendaDTO.getIdVenda(), 
				HttpMethod.GET, 
				null, 
				InfoTransporteDTO.class);
		
		vendaDTO.setIdTransporte(exchange.getBody().getIdTransporte());
		vendaDTO.setEstado(exchange.getBody().getEstado());
		vendaDTO.setEnderecoEntrega(exchange.getBody().getEndereçoEntrega());
		
		
	}

	public void mandandoDadosTransporte(NovaEntregaDTO novaEntrega) {
		RestTemplate client = new RestTemplate();
		
		ResponseEntity<NovaEntregaDTO> exchange = client.postForEntity("http://localhost:8082/trasnportadora/pedido/novo", 
				HttpMethod.POST, 
				null, 
				NovaEntregaDTO.class);
	}
	
	

}
