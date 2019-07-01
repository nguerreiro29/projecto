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

@WebServlet(name = "cidadedeleter", urlPatterns = "/cidadedelete")

public class CidadeDelete extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer index1 = Integer.valueOf(req.getParameter("index1"));
		
		Arraylista.cidades.remove(index1);
		
		resp.sendRedirect("/agenda-web/cidadelist");
	}

}
