<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/cidadeformcontroller">
		<table border="1">
			<tr>
				<td colspan="2">Formulario</td>
			</tr>
			<tr>
				<td>Nome</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Enviar" /> <input type="reset" value="Limpar" /></td>
			</tr>
		</table>
	</form>
	<a href="/agenda-web/cidadelist">Voltar</a>
</body>
</html>