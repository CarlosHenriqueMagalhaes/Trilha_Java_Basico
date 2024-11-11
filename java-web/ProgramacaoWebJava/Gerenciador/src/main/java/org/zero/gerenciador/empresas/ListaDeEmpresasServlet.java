/*
 * Acesse http://localhost:8080/gerenciador/form-new-inc.html para cadastrar as empresas
 * Acesse http://localhost:8080/gerenciador/listaDeEmpresas para ver a lista das empresas cadastradas
 */

package org.zero.gerenciador.empresas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaDeEmpresas")
public class ListaDeEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BancoDeDadosGenerico listaBanco = new BancoDeDadosGenerico();
		List<Empresa> listaDeEmpresas = listaBanco.getEmpresas();

		PrintWriter saida = response.getWriter();

		saida.println("<html><body>");
		saida.print("<ul>");// usado para lista
		saida.println("Empresas cadastradas:");
		for (Empresa empresa : listaDeEmpresas) {
			saida.println("<li>" + empresa.getNome() + "</li>");// li adiciona o ponto de novo tópico
		}
		saida.print("</ul>");
		saida.println("</body></html>");
	}

}
