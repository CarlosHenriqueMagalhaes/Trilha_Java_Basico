/*
 * 		Para testar esse codigo, após subir o server, acesse esse link no navegador
 * passando o nome da nova empresa:
 * 
 * 		//http://localhost:8080/gerenciador/newInc?nome=<nomeDaEmpresa>
 */

package org.zero.gerenciador.newInd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/gerenciador/newInc
@WebServlet("/newInc")
public class newInc extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa!");
		
		String nomeEmpresa = request.getParameter("nome");//ira pegar o parametro digitado no navegador (?nome:<>)
		PrintWriter saida = response.getWriter();
		
		saida.println("<html><body>Empresa "  + nomeEmpresa + " foi criada com sucesso!</body></html>");
	}

}
