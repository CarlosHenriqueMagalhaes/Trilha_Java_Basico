package org.zero.gerenciador.empresas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramId = request.getParameter("id");
		int id = Integer.valueOf(paramId);

		BancoDeDadosGenerico banco = new BancoDeDadosGenerico();
		Empresa empresa = banco.buscaEmpresaPeloId(id);

		System.out.println("id: " + empresa.getId() + " - " + empresa.getNome());

		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);

	}

}
