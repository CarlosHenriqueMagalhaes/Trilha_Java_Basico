/* O filtro consegue parar a execução, já que ele vem como uma camada à frente da aplicação.
 Essa é a diferença que podemos ver no nosso código, através do parâmetro
 FilterChain. Usamos o FilterChain para mandar a requisição para frente.
 */

package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/principal")
public class MonitoramentoFilter implements Filter {
	
	//para o jetty
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	//para o jetty
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		long antes = System.currentTimeMillis();

		String acao = request.getParameter("acao");

		// executa ação:
		chain.doFilter(request, response);

		long depois = System.currentTimeMillis();

		System.out.println("Tempo de execução da ação: " + acao + " -> " + (antes - depois));

	}

}
