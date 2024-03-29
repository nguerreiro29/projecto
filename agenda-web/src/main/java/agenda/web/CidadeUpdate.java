package agenda.web;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.entity.Cidade;

@WebServlet(name = "cidadeupdate", urlPatterns = "/cidadeupdate")

public class CidadeUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer codigo = Integer.valueOf(req.getParameter("codigo"));
		String nome = req.getParameter("nome");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action = \"cidadeupdatecontroller\">");
		out.println("<table border =\"1\">");
		out.println("<tr><td colspan=\"2\">Formulario</td></tr>");
		out.println("<tr><td>Codigo</td><td><input type=\"text\" name=\"codigo\" value=\"" + codigo + "\" readonly /></td></tr>");
		out.println("<tr><td>Nome</td><td><input type=\"text\" name=\"nome\"  value=\"" + nome + "\" /></td></tr>");
		out.println("<tr><td colspan=\"2\" align=\"center\">");
		out.println("<input type=\"submit\" value=\"Enviar\"/>");
		out.println("</td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("<a href=\"/agenda-web/cidadelist\">Voltar</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
