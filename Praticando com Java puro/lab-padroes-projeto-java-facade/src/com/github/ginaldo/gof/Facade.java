package com.github.ginaldo.gof;

import com.github.ginaldo.gof.subsistema1.crm.CrmService;
import com.github.ginaldo.gof.subsistema2.cep.CepAPI;

public class Facade {

	public void migrarCliente(String nome, String cep) {

		String cidade = CepAPI.getInstancia().recuperarCidade(cep);
		String estado = CepAPI.getInstancia().recuperarEstado(cep);

		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
