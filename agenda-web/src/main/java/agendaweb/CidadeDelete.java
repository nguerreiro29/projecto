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
		int codigo = Integer.valueOf(req.getParameter("codigo"));
		int index1 = 0;
		
		for(int i=0; i< Arraylista.cidades.size(); i++) {
			int codigo2 = Arraylista.cidades.get(i).getCodigo();
			if(codigo2 == codigo)
			{
				Arraylista.cidades.remove(i);
				break;
			}
		}
		
		//Arraylista.cidades.remove(index1);
		
		resp.sendRedirect("/agenda-web/cidadelist");
	}

}
