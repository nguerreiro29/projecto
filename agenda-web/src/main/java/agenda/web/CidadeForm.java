package agenda.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cidadeform", urlPatterns = "/cidadeform")

public class CidadeForm extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action = \"cidadeformcontroller\">");
		out.println("<table border =\"1\">");
		out.println("<tr><td colspan=\"2\">Formulario</td></tr>");
		out.println("<tr><td>Nome</td><td><input type=\"text\" name=\"nome\"/></td></tr>");
		out.println("<tr><td colspan=\"2\" align=\"center\">");
		out.println("<input type=\"submit\" value=\"Enviar\"/>");
		out.println("<input type=\"reset\" value=\"Limpar\"/>");
		out.println("</td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("<a href=\"/agenda-web/cidadelist\">Voltar</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
