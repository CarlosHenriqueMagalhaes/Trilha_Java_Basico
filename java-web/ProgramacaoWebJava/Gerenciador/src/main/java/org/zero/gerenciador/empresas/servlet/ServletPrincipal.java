package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.acoes.AlteraEmpresa;
import org.zero.gerenciador.empresas.acoes.ListaEmpresas;
import org.zero.gerenciador.empresas.acoes.MostraEmpresa;
import org.zero.gerenciador.empresas.acoes.NovaEmpresa;
import org.zero.gerenciador.empresas.acoes.RemovaEmpresa;

//acesso http://localhost:8080/gerenciador/principal?acao=ListaEmpresas
//acesso para cadastrar uma nova empresa http://localhost:8080/gerenciador/formNovaEmpresa.jsp
@WebServlet("/principal")
public class ServletPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

		if (paramAcao.equals("ListaEmpresas")) {
			ListaEmpresas acao = new ListaEmpresas();
			acao.executaListagemEmpresas(request, response);

		} else if (paramAcao.equals("MostraEmpresa")) {
			MostraEmpresa acao = new MostraEmpresa();
			acao.executaMostrarEmpresa(request, response);

		} else if (paramAcao.equals("RemovaEmpresa")) {
			RemovaEmpresa acao = new RemovaEmpresa();
			acao.executaRemovaEmpresa(request, response);

		} else if (paramAcao.equals("AlteraEmpresa")) {
			AlteraEmpresa acao = new AlteraEmpresa();
			acao.executaAlteraEmpresa(request, response);

		} else if (paramAcao.equals("NovaEmpresa")) {
			NovaEmpresa acao = new NovaEmpresa();
			acao.executaCadastraNovaEmpresa(request, response);
		}
	}
}
