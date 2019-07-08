<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" type="text/css" />
</head>
<body>
<div>
			<% Integer codigo = Integer.valueOf(request.getParameter("codigo")); %>
			<% String nome = request.getParameter("nome"); %>
			<h1>Cidade</h1>
	<form action="<%=request.getContextPath()%>/cidadeupdatecontroller">
		<label for="codigo">Codigo</label>
		<input type="text" name="codigo" value="<%=codigo%>" readonly />
		<label for="nome">Nome</label>
		<input type="text" name="nome"  value="<%=nome%>" />
		<input type="submit" value="Enviar"/>
		</form>
		<p><a href="/agenda-web/jsp/cidade/read.jsp">Voltar</a></p>
</div>
</body>
</html>