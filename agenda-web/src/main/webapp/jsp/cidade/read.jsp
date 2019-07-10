<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ page import="agenda.entity.Cidade"%>
    <%@ page import="agenda.business.ICidadeBUSINESS"%>
    <%@ page import="agenda.impl.CidadeBUSINESS"%>
    <%! private ICidadeBUSINESS business = new CidadeBUSINESS(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" type="text/css" />
</head>
<body>
<div>
		<table>
		<tr><td><label>Codigo</label></td><td><label>Nome</label></td><td> </td><td> </td></tr>
		<tr><td>&nbsp</td></tr>
		<% for (Cidade cidade: business.read())  { %>
			 <tr><td><%=cidade.getCodigo()%></td>
			 	 <td><%=cidade.getNome()%></td>
			 	 <td><a href="updateform.jsp?codigo=<%=cidade.getCodigo()%>&nome=<%=cidade.getNome()%>">Editar</a></td>
			 	 <td><a href="<%=request.getContextPath()%>/cidadedelete?codigo=<%=cidade.getCodigo()%>">Apagar</a></td></tr>
			 	 <tr><td>&nbsp</td></tr>
			<% }%>
		</table>
		<tr><td>&nbsp</td></tr>
		<tr><td><p><a href="createform.jsp">Adicionar</a></p></td></tr>
</div>		
</body>
</html>