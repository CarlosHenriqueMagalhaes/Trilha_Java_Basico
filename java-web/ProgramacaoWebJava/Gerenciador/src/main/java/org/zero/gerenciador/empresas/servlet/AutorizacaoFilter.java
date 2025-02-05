package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/principal")
public class AutorizacaoFilter extends HttpFilter implements Filter {

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;// casting
		HttpServletResponse response = (HttpServletResponse) servletResponse;// casting
		HttpSession sessao = request.getSession();

		String paramAcao = request.getParameter("acao");

		// para auxiliar a condição que verifica se o usuario esta logado:
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);

		// garante que apenas as paginas Login e LoginForm não sejam protegidas:
		boolean acaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));

		if (usuarioNaoEstaLogado && acaoProtegida) {
			response.sendRedirect("principal?acao=LoginForm");
			return;
		}
		
		chain.doFilter(request, response);
	}

}
