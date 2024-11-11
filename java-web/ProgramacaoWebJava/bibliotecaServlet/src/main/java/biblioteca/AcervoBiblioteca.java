package biblioteca;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acervoBiblioteca")
public class AcervoBiblioteca extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco listaBanco = new Banco();
		List<Livro> acervo = listaBanco.getLivros();

		PrintWriter saida = response.getWriter();

		saida.println("<html><body>");
		saida.print("<ul>");// usado para lista
		saida.println("Acervo de livros:");
		for (Livro livro : acervo) {
			saida.println("<li>" + livro.getTitulo() + "</li>");// li adiciona o ponto de novo tópico
		}
		saida.print("</ul>");
		saida.println("</body></html>");
	}

}
