package org.zero.gerenciador.empresas.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		System.out.println("Logando " + login);

		return "redirect:principal?acao=ListaEmpresas";
	}

}
