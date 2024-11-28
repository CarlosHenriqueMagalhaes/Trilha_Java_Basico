package org.zero.gerenciador.empresas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.catalina.webresources.EmptyResourceSet;

public class BancoDeDadosGenerico {

	private static List<Empresa> listaDeEmpresa = new ArrayList<Empresa>();
	private static int chaveSequencial = 1;

	// O Server já inicializa com uma empresa na lista:
	static {
		Empresa empresaPadrao = new Empresa();
		empresaPadrao.setNome("Alquimech ltda.");
		empresaPadrao.setId(chaveSequencial++);
		listaDeEmpresa.add(empresaPadrao);
	}

	public void adiciona(Empresa empresa) {
		if (empresa.getNome().isBlank()) {
			System.out.println("Nenhuma empresa cadastrada!");
		} else {
			empresa.setId(chaveSequencial++);
			listaDeEmpresa.add(empresa);
		}

	}

	public List<Empresa> getEmpresas() {
		return listaDeEmpresa;
	}

	public void removeEmpresa(int id) {

		Iterator<Empresa> iteratorEmpresa = listaDeEmpresa.iterator();

		while (iteratorEmpresa.hasNext()) {
			Empresa empresa = iteratorEmpresa.next();

			if (empresa.getId() == id) {
				iteratorEmpresa.remove();
			}
		}

	}

	public Empresa buscaEmpresaPeloId(int id) {
		for (Empresa empresa : listaDeEmpresa) {
			if(empresa.getId()==id) {
				return empresa;
			}
			
		}
		return null;
		
	}
}
