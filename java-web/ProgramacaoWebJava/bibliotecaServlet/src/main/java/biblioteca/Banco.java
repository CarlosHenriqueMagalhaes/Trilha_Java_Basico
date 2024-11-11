package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Livro> acervoBiblioteca = new ArrayList<Livro>();
	
	public void cadastrar(Livro novoLivro) {
		acervoBiblioteca.add(novoLivro);

	}

	public List<Livro> getLivros(){
		return acervoBiblioteca;
	}
}
