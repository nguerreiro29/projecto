package exemplos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Cidade;

@WebServlet(name = "exceptions", urlPatterns = "/exceptions")

public class MyException extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			PrintWriter out = resp.getWriter();
			out.println("<html>"); 
			out.println("<body>");
			out.println("Delete efectuado com sucesso"); 
			out.println("<a href=\"/agenda-web/cidadelist\">Voltar</a>");
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception e)
		{
			throw new ServletException(e);
		}
	
}
}