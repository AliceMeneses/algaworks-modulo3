package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiModulo3Application;
import com.algaworks.algafood.domain.model.Cozinha;

public class AlteracaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext aplicationContext = new SpringApplicationBuilder(AlgafoodApiModulo3Application.class)
				.web(WebApplicationType.NONE)
				.run(args);

		CadastroCozinha cadastroCozinha = aplicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha = new Cozinha();
		
		cozinha.setId(1L);
		cozinha.setNome("Grega");
		
		cozinha = cadastroCozinha.salvar(cozinha);
		
		System.out.println(cozinha.getNome() + " - " + cozinha.getId());
	}

}
