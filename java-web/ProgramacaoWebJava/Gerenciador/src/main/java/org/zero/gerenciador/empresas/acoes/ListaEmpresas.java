package org.zero.gerenciador.empresas.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.modelo.BancoDeDadosGenerico;
import org.zero.gerenciador.empresas.modelo.Empresa;

public class ListaEmpresas {
	public void executaListagemEmpresas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Listando empresas");
		
		BancoDeDadosGenerico listaBanco = new BancoDeDadosGenerico();
		List<Empresa> listaDeEmpresas = listaBanco.getEmpresas();

		request.setAttribute("listaDeEmpresasCadastradas", listaDeEmpresas);

		RequestDispatcher despachar = request.getRequestDispatcher("/ListaDeEmpresas.jsp");
		despachar.forward(request, response);
	}

}
