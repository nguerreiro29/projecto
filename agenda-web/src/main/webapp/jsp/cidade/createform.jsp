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
<h1>Cidade</h1>
	<form action="<%=request.getContextPath()%>/cidadeformcontroller">
				<label for="nome">Nome</label>
				<input type="text" name="nome" id="nome"/>
				<input type="submit" value="Enviar" /> 
	</form>
	
	<p><a href="/agenda-web/jsp/cidade/read.jsp">Voltar</a></p>
</div>
</body>
</html>