package org.zero.gerenciador.empresas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramId = request.getParameter("id");
		int id = Integer.valueOf(paramId);

		System.out.println(id);

		// mesmo criando um banco existe apenas uma lista de empresa, pq ele é static
		BancoDeDadosGenerico banco = new BancoDeDadosGenerico();
		banco.removeEmpresa(id);

		response.sendRedirect("listaEmpresas");
	}
}
