package org.zero.gerenciador.empresas.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.modelo.BancoDeDadosGenerico;

public class RemovaEmpresa {
	public void executaRemovaEmpresa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("Removendo empresa");
		
		String paramId = request.getParameter("id");
		int id = Integer.valueOf(paramId);

		System.out.println(id);

		BancoDeDadosGenerico banco = new BancoDeDadosGenerico();
		banco.removeEmpresa(id);
		
		response.sendRedirect("principal?acao=ListaEmpresas");
	}
}