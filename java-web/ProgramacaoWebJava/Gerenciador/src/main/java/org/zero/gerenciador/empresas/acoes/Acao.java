package org.zero.gerenciador.empresas.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Acao {
	String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}
