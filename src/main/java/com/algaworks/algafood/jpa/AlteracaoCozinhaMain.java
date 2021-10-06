package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiModulo3Application;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class AlteracaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext aplicationContext = new SpringApplicationBuilder(AlgafoodApiModulo3Application.class)
				.web(WebApplicationType.NONE)
				.run(args);

		CozinhaRepository cozinhaRepository = aplicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		
		cozinha.setId(1L);
		cozinha.setNome("Grega");
		
		cozinha = cozinhaRepository.salvar(cozinha);
		
		System.out.println(cozinha.getNome() + " - " + cozinha.getId());
	}

}
