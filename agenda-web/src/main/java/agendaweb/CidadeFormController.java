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
		PrintWriter out = resp.getWriter();
		String nome = req.getParameter("nome");
		String nomeUpper = nome.toUpperCase();
		
		if(nome == null || nome.isEmpty()){
			  out.println("<html>"); 
			  out.println("<body>");
			  out.println("Preenchimento obrigatorio."); 
			  out.println("</body>");
			  out.println("</html>");
			  //resp.sendRedirect("/agenda-web/cidadeform");
			  return;
		}
		if (!nome.isEmpty()) 
		{
			for(int i=0; i< Arraylista.cidades.size(); i++) 
			{
				String nomearray = Arraylista.cidades.get(i).getNome();
				String nomearrayUpper = nomearray.toUpperCase();
				if(nomearrayUpper.equals(nomeUpper))
				{
					out.println("<html>"); 
					out.println("<body>");
					out.println("Cidade ja existe."); 
					out.println("</body>");
					out.println("</html>");
					//resp.sendRedirect("/agenda-web/cidadeform");
					return;
				}
			}
		}
		int codigoarray = 0;
		for(int j=Arraylista.cidades.size()-1; j>=0; j--) 
		{
			codigoarray = Arraylista.cidades.get(j).getCodigo();
			break;
		}
		int codigo = codigoarray+1;
		Cidade cidade = new Cidade(codigo, nome);
		Arraylista.cidades.add(cidade);
		resp.sendRedirect("/agenda-web/cidadelist");
	}
}
	
