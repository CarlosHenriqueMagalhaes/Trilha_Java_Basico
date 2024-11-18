<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkDeAcessoANovaEmpresaServlet"/>

	<!DOCTYPE html>
	<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>
	<form action="${ linkDeAcessoANovaEmpresaServlet }" method="post">
		Nome: <input type="text" name="nome" /> <input type="submit"
			value="Enviar nome Empresa">
	</form>
</body>

	</html>