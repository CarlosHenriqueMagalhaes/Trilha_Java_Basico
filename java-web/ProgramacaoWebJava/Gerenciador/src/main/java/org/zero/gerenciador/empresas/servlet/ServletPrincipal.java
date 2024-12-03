package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.acoes.ListaEmpresas;

@WebServlet("/principal")
public class ServletPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		
		if(paramAcao.equals("ListaEmpresas")) {
			ListaEmpresas acao = new ListaEmpresas();
			acao.executaListagemEmpresas(request,response);
			
		}else if (paramAcao.equals("MostraEmpresa")){
			System.out.println("Mostrando empresa");
			
		}else if (paramAcao.equals("RemovaEmpresa")) {
			System.out.println("Removendo empresa");
			
		}
	}

}
