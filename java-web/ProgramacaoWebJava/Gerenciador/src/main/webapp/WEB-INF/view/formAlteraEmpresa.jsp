<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/principal" var="linkDeAcessoANovaEmpresaServlet" />

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>
	<c:import url="LogoutParcial.jsp" />
	<form action="${ linkDeAcessoANovaEmpresaServlet }" method="post">
		Nome: <input type="text" name="nome" value="${ empresa.nome }" />
		Data Abertura: <input type="text" name="data"
			value=" <fmt:formatDate
value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy" />" />
		<input type="submit" value="Enviar dados"> <input
			type="hidden" name="id" value="${ empresa.id }"> <input
			type="hidden" name="acao" value="AlteraEmpresa">
	</form>
</body>

</html>