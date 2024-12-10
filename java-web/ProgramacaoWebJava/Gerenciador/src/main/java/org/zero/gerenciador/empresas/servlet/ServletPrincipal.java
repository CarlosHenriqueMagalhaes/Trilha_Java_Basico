package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.acoes.AlteraEmpresa;
import org.zero.gerenciador.empresas.acoes.FormularioNovaEmpresa;
import org.zero.gerenciador.empresas.acoes.ListaEmpresas;
import org.zero.gerenciador.empresas.acoes.MostraEmpresa;
import org.zero.gerenciador.empresas.acoes.NovaEmpresa;
import org.zero.gerenciador.empresas.acoes.RemovaEmpresa;

//acesso http://localhost:8080/gerenciador/principal?acao=ListaEmpresas
//acesso para cadastrar uma nova empresa http://localhost:8080/gerenciador/formNovaEmpresa.jsp
//acesso http://localhost:8080/gerenciador/principal?acao=FormularioNovaEmpresa
@WebServlet("/principal")
public class ServletPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		String nome = null;

		if (paramAcao.equals("ListaEmpresas")) {
			ListaEmpresas acao = new ListaEmpresas();
			nome = acao.executa(request, response);

		} else if (paramAcao.equals("MostraEmpresa")) {
			MostraEmpresa acao = new MostraEmpresa();
			nome = acao.executa(request, response);

		} else if (paramAcao.equals("RemovaEmpresa")) {
			RemovaEmpresa acao = new RemovaEmpresa();
			nome = acao.executa(request, response);

		} else if (paramAcao.equals("AlteraEmpresa")) {
			AlteraEmpresa acao = new AlteraEmpresa();
			nome = acao.executa(request, response);

		} else if (paramAcao.equals("NovaEmpresa")) {
			NovaEmpresa acao = new NovaEmpresa();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("FormularioNovaEmpresa")) {
			FormularioNovaEmpresa acao = new FormularioNovaEmpresa();
			nome = acao.executa(request, response);
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
