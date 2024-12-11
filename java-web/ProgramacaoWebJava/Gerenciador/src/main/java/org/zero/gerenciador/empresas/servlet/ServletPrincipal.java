package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.acoes.Acao;

//acesso http://localhost:8080/gerenciador/principal?acao=ListaEmpresas
//acesso para cadastrar uma nova empresa http://localhost:8080/gerenciador/formNovaEmpresa.jsp
//acesso http://localhost:8080/gerenciador/principal?acao=FormularioNovaEmpresa
//acesso ao login  http://localhost:8080/gerenciador/principal?acao=LoginForm
@WebServlet("/principal")
public class ServletPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

		String nomeClasse = ("org.zero.gerenciador.empresas.acoes." + paramAcao);
		String nome;
		try {
			Class classe = Class.forName(nomeClasse); // carrega a classe com o nome
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException
				| ServletException e) {
			throw new ServletException(e);
		}

		String[] tipoEEndereco = nome.split(":");
		if (tipoEEndereco[0].equals("forward")) {
			RequestDispatcher despachar = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			despachar.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}

	}
}
