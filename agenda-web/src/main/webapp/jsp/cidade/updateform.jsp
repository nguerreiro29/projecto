<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<% Integer codigo = Integer.valueOf(request.getParameter("codigo")); %>
			<% String nome = request.getParameter("nome"); %>
	<form action="<%=request.getContextPath()%>/cidadeupdatecontroller">
		<table border ="1">
		<tr><td colspan="2">Formulário</td></tr>
		<tr><td>Codigo</td><td><input type="text" name="codigo" value="<%=codigo%>" readonly /></td></tr>
		<tr><td>Nome</td><td><input type="text" name="nome"  value="<%=nome%>" /></td></tr>
		<tr><td colspan="2" align="center">
		<input type="submit" value="Enviar"/>
		</td></tr>
		</table>
		</form>
		<a href="/agenda-web/cidadelist">Voltar</a>
</body>
</html>