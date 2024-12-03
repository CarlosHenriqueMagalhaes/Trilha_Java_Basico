/*
 * Acesse http://localhost:8080/gerenciador/formNovaEmpresa.jsp para cadastrar as empresas
 * Acesse http://localhost:8080/gerenciador/listaDeEmpresas para ver a lista das empresas cadastradas
 */

package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.modelo.BancoDeDadosGenerico;
import org.zero.gerenciador.empresas.modelo.Empresa;

@WebServlet("/listaEmpresas")
public class ListaDeEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BancoDeDadosGenerico listaBanco = new BancoDeDadosGenerico();
		List<Empresa> listaDeEmpresas = listaBanco.getEmpresas();

		request.setAttribute("listaDeEmpresasCadastradas", listaDeEmpresas);

		RequestDispatcher despachar = request.getRequestDispatcher("/ListaDeEmpresas.jsp");
		despachar.forward(request, response);
	}

}