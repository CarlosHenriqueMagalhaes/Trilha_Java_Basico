package org.zero.gerenciador.empresas;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosGenerico {

	private static List<Empresa> listaDeEmpresa = new ArrayList<Empresa>();

	// O Server já inicializa com uma empresa na lista:
	static {
		Empresa empresaPadrao = new Empresa();
		empresaPadrao.setNome("Alquimech ltda.");
		listaDeEmpresa.add(empresaPadrao);
	}

	public void adiciona(Empresa empresa) {
		if (empresa.getNome().isBlank()) {
			System.out.println("Nenhuma empresa cadastrada!");
		} else {

			listaDeEmpresa.add(empresa);
		}
	}

	public List<Empresa> getEmpresas() {
		return listaDeEmpresa;
	}

}
