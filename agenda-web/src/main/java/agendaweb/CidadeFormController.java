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

@WebServlet(name = "cidadeformcontroller", urlPatterns = "/cidadeformcontroller")

public class CidadeFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer codigo = Integer.valueOf(req.getParameter("codigo"));
		String nome = req.getParameter("nome");
		
		Cidade cidade = new Cidade(codigo, nome);
		Arraylista.cidades.add(cidade);
		
		resp.sendRedirect("/agenda-web/cidadelist");
	}
	
	
}
