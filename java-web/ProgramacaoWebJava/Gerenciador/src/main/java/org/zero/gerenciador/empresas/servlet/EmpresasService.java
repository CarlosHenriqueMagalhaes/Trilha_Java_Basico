package org.zero.gerenciador.empresas.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zero.gerenciador.empresas.modelo.BancoDeDadosGenerico;
import org.zero.gerenciador.empresas.modelo.Empresa;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.XStream;

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Empresa> empresas = new BancoDeDadosGenerico().getEmpresas();

		String valor = request.getHeader("Accept");
		
// não funciona a parte xml por conta da compatibilidade do Xstream que ficou defasado perante a nova atualização do
//TOMCAT esse codigo era para devolver ou em json, ou xml...
		
//		if (valor.contains("xml")) {
//			XStream xstream = new XStream();
//			xstream.alias("empresa", Empresa.class);
//			String xml = xstream.toXML(empresas);
//
//			response.setContentType("application/xml");
//			response.getWriter().print(xml);
//
//		} else 
			if (valor.endsWith("json")) {
			Gson gson = new Gson();
			String json = gson.toJson(empresas);

			response.setContentType("application/json");
			response.getWriter().print(json);

		} else {
			response.setContentType("application/json");
			response.getWriter().print("{'message':'no content'}");
		}

	}

}
