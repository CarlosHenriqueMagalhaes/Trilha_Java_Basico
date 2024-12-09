package org.zero.gerenciador.empresas.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.modelo.BancoDeDadosGenerico;
import org.zero.gerenciador.empresas.modelo.Empresa;

public class MostraEmpresa {
	public String executaMostrarEmpresa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("mostrando empresa");

		String paramId = request.getParameter("id");
		int id = Integer.valueOf(paramId);

		BancoDeDadosGenerico banco = new BancoDeDadosGenerico();
		Empresa empresa = banco.buscaEmpresaPeloId(id);

		System.out.println("id: " + empresa.getId() + " - " + empresa.getNome());

		request.setAttribute("empresa", empresa);

		return "forward:/formAlteraEmpresa.jsp";

	}
}
