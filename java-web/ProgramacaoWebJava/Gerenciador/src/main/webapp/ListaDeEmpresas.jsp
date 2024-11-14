<%@ page import="java.util.List , org.zero.gerenciador.empresas.Empresa"%>
<%
List<Empresa> listaDeEmpresas = (List<Empresa>) request.getAttribute("listas");
%>

<html>
<body>
	<ul>
		Empresas Cadastradas:
		<%
	for (Empresa empresa : listaDeEmpresas) {
	%>
		<li><%=empresa.getNome()%></li>
		<%
		}
		%>
	</ul>

</body>
</html>
