package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiModulo3Application;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

public class ConsultaRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext aplicationContext = new SpringApplicationBuilder(AlgafoodApiModulo3Application.class)
				.web(WebApplicationType.NONE)
				.run(args);

		RestauranteRepository restauranteRepository = aplicationContext.getBean(RestauranteRepository.class);
		
		List<Restaurante> restaurantes = restauranteRepository.listar();
		
		for(Restaurante restaurante : restaurantes) {
			System.out.printf("%s - %f - %s\n", restaurante.getNome(), restaurante.getTaxafrete(), restaurante.getCozinha().getNome());
		}
	}

}
