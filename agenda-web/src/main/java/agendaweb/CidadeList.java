package agendaweb;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Cidade;

@WebServlet(name = "cidadelist", urlPatterns = "/cidadelist")

public class CidadeList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=\"#FF0000\">");
		out.println("<table border =\"1\">");
		out.println("<tr><td colspan=\"4\">Parametros recebidos</td></tr>");
		out.println("<tr><td>Codigo</td><td>Nome</td><td> </td><td> </td></tr>");
		for (Cidade cidade : Arraylista.cidades) {
			Integer index1 = Arraylista.cidades.indexOf(cidade);
			out.println("<tr><td>" + cidade.getCodigo() + "</td><td>" + cidade.getNome() + "</td><td><a href=\"/agenda-web/cidadeupdate?id="+ cidade.getCodigo() + "&nome=" + cidade.getNome() + "&index=" + index1 + "\">Editar</a></td><td><a href=\"/agenda-web/cidadedelete?id=" + index1 + "\">Apagar</a></td></tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
	}
