package org.zero.gerenciador.empresas.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.modelo.BancoDeDadosGenerico;
import org.zero.gerenciador.empresas.modelo.Empresa;

public class ListaEmpresas implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Listando empresas");

		BancoDeDadosGenerico listaBanco = new BancoDeDadosGenerico();
		List<Empresa> listaDeEmpresas = listaBanco.getEmpresas();

		request.setAttribute("listaDeEmpresasCadastradas", listaDeEmpresas);

		return "forward:ListaDeEmpresas.jsp";
	}

}
