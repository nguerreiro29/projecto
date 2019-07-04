<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ page import="entity.Cidade"%>
    <%@ page import="agendabusiness.ICidadeBUSINESS"%>
    <%@ page import="impl.CidadeBUSINESS"%>
    <%! private ICidadeBUSINESS business = new CidadeBUSINESS(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table border ="1">
		<tr><td colspan="4">Lista</td></tr>
		<tr><td>Codigo</td><td>Nome</td><td> </td><td> </td></tr>
		<% for (Cidade cidade: business.read())  { %>
			 <tr><td><%=cidade.getCodigo()%></td>
			 	 <td><%=cidade.getNome()%></td>
			 	 <td><a href="updateform.jsp?codigo=<%=cidade.getCodigo()%>&nome=<%=cidade.getNome()%>">Editar</a></td>
			 	 <td><a href="<%=request.getContextPath()%>/cidadedelete?codigo=<%=cidade.getCodigo()%>">Apagar</a></td></tr>
			<% }%>
		</table>
		<a href="createform.jsp">Adicionar</a>
		</body>
		</html>
</body>
</html>