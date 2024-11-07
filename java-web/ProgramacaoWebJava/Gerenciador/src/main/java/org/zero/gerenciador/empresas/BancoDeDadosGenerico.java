package org.zero.gerenciador.empresas;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosGenerico {

	private static List<Empresa> listaDeEmpresa = new ArrayList<Empresa>();

	public void adiciona(Empresa empresa) {
		listaDeEmpresa.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return listaDeEmpresa;
	}

}
