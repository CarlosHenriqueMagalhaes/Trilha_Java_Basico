package biblioteca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BibliotecaDigital")
public class BibliotecaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Cadastrando novo livro na biblioteca!");

		String novoLivro = request.getParameter("titulo");
		Livro livro = new Livro();
		livro.setTitulo(novoLivro);

		Banco banco = new Banco();
		banco.cadastrar(livro);

		PrintWriter out = response.getWriter();// para escrever caracteres

		out.println("<html><body>O livro:  " + novoLivro + " foi registrado na biblioteca!</body></html>");// imprime no
																											// navegador
		System.out.println(novoLivro + " foi cadastrado!");// exibe no console do servlet

	}

}
