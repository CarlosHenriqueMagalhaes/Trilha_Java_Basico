package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.modelo.BancoDeDadosGenerico;
import org.zero.gerenciador.empresas.modelo.Empresa;

import com.google.gson.Gson;

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Empresa> empresas = new BancoDeDadosGenerico().getEmpresas();

		// A biblioteca Gson trabalha com JSON
		// Foi adicionado a biblioteca na lib em WEB-INF (gson-2.8.5.jar)
		Gson gson = new Gson();
		String json = gson.toJson(empresas);

		response.setContentType("application/json");
		response.getWriter().print(json);

	}

}
