package org.zero.gerenciador.empresas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/gerenciador/novaEmpresa
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa!");

		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);

		BancoDeDadosGenerico banco = new BancoDeDadosGenerico();
		banco.adiciona(empresa);

		// Chamar o jsp
		RequestDispatcher despachar = request.getRequestDispatcher("/NovaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		despachar.forward(request, response);
	}

}