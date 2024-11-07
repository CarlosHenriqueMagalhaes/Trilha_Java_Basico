/*
 * 		Para testar esse codigo, após subir o server, acesse esse link no navegador
 * passando o nome da nova empresa:
 * 
 * 		//http://localhost:8080/gerenciador/newInc?nome=<nomeDaEmpresa>
 */

package org.zero.gerenciador.empresas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/gerenciador/newInc
@WebServlet("/newInc")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * Ao colocar a sobreescrita doPost esse método só irá aceitar requisições Post.
	 * Agora já não aceita o uso de
	 * http://localhost:8080/gerenciador/newInc?nome=<nomeDaEmpresa> no navegador,
	 * ele retorna um erro 405, pois esse método não é mais get! Acesse esse método
	 * através de http://localhost:8080/gerenciador/form-new-inc.html no navegador
	 * (ele usa o html criado nesse projeto)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa!");// imprime no console do servidor

		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);

		BancoDeDadosGenerico banco = new BancoDeDadosGenerico();
		banco.adiciona(empresa);

		PrintWriter saida = response.getWriter();// para escrever caracteres

		saida.println("<html><body>Empresa " + nomeEmpresa + " foi criada com sucesso!</body></html>");// imprime no
																										// navegador
		System.out.printf(nomeEmpresa + " foi cadastrada!");// exibe no console do servlet
	}

}
