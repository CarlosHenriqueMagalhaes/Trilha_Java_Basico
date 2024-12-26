<%@ page
	import="java.util.List ,org.zero.gerenciador.empresas.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE hmtl>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>

<body>

	Usuario Logado: ${usuarioLogado.login }

	<br>
	<br>
	<br>

	<c:if test="${not empty empresa}">
	Empresa ${ empresa } foi cadastrada com sucesso!
	</c:if>

	Lista de Empresas:

	<br />
	<ul>
		<c:forEach items="${ listaDeEmpresasCadastradas }" var="empresa">
			<li>${ empresa.nome }-<fmt:formatDate
					value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy" /> <a
				href="/gerenciador/principal?acao=MostraEmpresa&id=${ empresa.id }">edita</a>
				<a
				href="/gerenciador/principal?acao=RemovaEmpresa&id=${ empresa.id }">remove</a>
			</li>
		</c:forEach>
	</ul>

</body>
</html>
