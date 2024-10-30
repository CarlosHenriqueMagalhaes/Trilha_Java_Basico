package org.zero.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/gerenciador/first-servlet
@WebServlet(urlPatterns = "/first-servlet")
public class FirstServlet extends HttpServlet {
	
	//subscrevendo metodo service -> (service + ctrl + space)
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<bodyl>");
		out.println("Primeiro Servlet Online!");
		out.println("</bodyl>");
		out.println("</html>");
		
		//log deve aparecer ao chamar pelo navegador
		System.out.println("o servlet FirstServlet foi chamado!");
	}

}
