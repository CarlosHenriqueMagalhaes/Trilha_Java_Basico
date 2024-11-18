<%@ page import="java.util.List , org.zero.gerenciador.empresas.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
Lista de Empresas:
<br />

<ul>
	<c:forEach items="${ listaDeEmpresasCadastradas }" var="empresa">
		<li>${ empresa.nome }</li>
	</c:forEach>
</ul>

</body>
</html>
