package org.zero.gerenciador.empresas.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		HttpSession sessao = request.getSession();
		sessao.invalidate(); //invalida toda a sessão incluindo os cookies

		return "redirect:principal?acao=LoginForm";
	}

}
